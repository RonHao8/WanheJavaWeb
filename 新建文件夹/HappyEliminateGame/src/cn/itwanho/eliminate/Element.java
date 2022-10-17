package cn.itwanho.eliminate;

import javax.swing.*;
import java.awt.*;

//元素
public abstract class Element {
    private int x;
    private int y;
    private boolean selected;//是否选中
    private boolean eliminated;//是否可消
    private int eliminatedIndex;//记录爆炸动画图的起始下标

    //构造方法
    public Element(int x,int y){//每个元素坐标都不一样，需传递参数
        this.x=x;
        this.y=y;
        selected=false;
        eliminated=false;
        eliminatedIndex=0;
    }

    //获取图片
    public abstract ImageIcon getImage();

    //是否选中
    public boolean isSelected(){
        return selected;
    }
    //是否可消除
    public boolean isEliminated(){
        return eliminated;
    }

    //画元素      g:画笔
    public void paintElement(Graphics g){
        if(isSelected()){
            //选中
            g.setColor(Color.GREEN);//将画笔颜色设置为绿色
            g.fillRect(x,y,World.ELEMENT_SIZE,World.ELEMENT_SIZE);//填充矩形
            this.getImage().paintIcon(null,g,this.x,this.y);//画图片
        }else if (isEliminated()){//若可消
            //四张爆炸图，不建议用for,for循环执行太快，用线程控制，让线程休眠
            if (eliminatedIndex < Images.bombs.length){//若没有到最后一张爆炸图
                Images.bombs[eliminatedIndex++].paintIcon(null,g,x,y);//画爆炸图
            }
        }else {//正常画元素
            this.getImage().paintIcon(null,g,this.x,this.y);//画图片
        }
    }
    //  设置元素选中状态值
    public void setSelected(boolean selected){
        this.selected=selected;
    }

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setEliminated(boolean eliminated){
        this.eliminated=eliminated;
    }



}
