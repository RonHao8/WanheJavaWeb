package cn.itwanho.eliminate;

import javax.swing.*;
import java.awt.*;

public abstract class Element {
    private  int x;
    private  int y;

    private  boolean selected;//是否选中

    private  boolean eliminated;//是否可消

    private int eliminatedIndex;//爆炸动画图片的起始下标（爆炸图有四张图，放在数组中）


    //构造方法
    public Element(int x,int y){//每个元素的坐标都不一样，需要传递参数
        this.x = x;
        this.y = y;

        selected = false;//默认没有选中
        eliminated = false;//默认不可消除
        eliminatedIndex = 0;//默认初始值为0
    }

    //获取图片
    public  abstract ImageIcon getImage();

    //是否选中
    public  boolean isSelected(){
        return selected;
    }

    //是否可消


    public boolean isEliminated() {
        return eliminated;
    }



    //画元素 g:画笔
    public void paintElement(Graphics g){
        if(isSelected()){//若选中了
            g.setColor(Color.GREEN);//将画笔颜色设置为绿色
            g.fillRect(x,y,World.ELEMENT_SIZE,World.ELEMENT_SIZE);//填充矩形
            this.getImage().paintIcon(null,g,this.x,this.y);//画图片
        }else if(isEliminated()){//若可消

            //四张爆炸图，不建议用for，for循环执行太块，用线程控制，让线程休眠
            if(eliminatedIndex < Images.bombs.length){//若没有到最后一张爆炸图
                Images.bombs[eliminatedIndex++].paintIcon(null,g,x,y);
            }
        }else {//正常画元素
            this.getImage().paintIcon(null,g,this.x,this.y);//画图片
        }
    }


    //设置元素选中状态值
    public void setSelected(boolean selected){
        this.selected = selected;
    }

    //设置元素可消状态
    public void setEliminated(boolean eliminated) {
        this.eliminated = eliminated;
    }


    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

}
