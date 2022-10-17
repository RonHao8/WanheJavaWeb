package cn.itwanho.eliminate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

//窗口类
public class World extends JPanel {
    public static final int WIDTH=429;//窗口宽
    public static final int HEIGHT=570;//窗口高

    public static final int ROWS=8;//8行
    public static final int COLS=6;//6列

    public static final int ELEMENT_SIZE=60;//元素大小宽高60px

    public static final int OFFSET=30;//偏移量30px(第一个元素距离上边缘左边缘的距离)

    private Element[][] elements=new Element[ROWS][COLS];//元素数据8行6列

    /*
    创建元素
    int x=OFFSET+col*ELEMENT_SIZE;
    int y=OFFSET+row*ELEMENT_SIZE;
     */
    //元素类型
    public static final int ELEMENT_TYPE_BEAR=0;//熊
    public static final int ELEMENT_TYPE_BIRD=1;//鸟
    public static final int ELEMENT_TYPE_FOX=2;//狐狸
    public static final int ELEMENT_TYPE_FROG=3;//青蛙

    public Element creatElement(int row,int col){
        int x=OFFSET+col*ELEMENT_SIZE;
        int y=OFFSET+row*ELEMENT_SIZE;

        Random random=new Random();
        int type= random.nextInt(4);//0-3之间的整数
        switch (type){
            case ELEMENT_TYPE_BEAR:
                return new Bear(x,y);
            case ELEMENT_TYPE_BIRD:
                return new Bird(x,y);
            case ELEMENT_TYPE_FOX:
                return new Fox(x,y);
            default:
                return new Frog(x,y);
        }
    }

    //元素可消状态
    public static final int ELEMENT_NON=0;//不可消除
    public static final int ELEMENT_ROW=1;//行可消
    public static final int ELEMENT_COL=2;//列可消

    //检测元素是否可消，返回的是元素的可消状态（0,1,2）
    public int canEliminate(int row,int col){
        Element e = elements[row][col];//获取当前元素
        //判断横向
        if(col>=2){
            Element e1 = elements[row][col - 1];//获取当前元素左边一个
            Element e2 = elements[row][col - 2];//获取当前元素左边第二个
            if(e!=null&&e1!=null&&e2!=null){
                if(e.getClass().equals(e1.getClass())&&e.getClass().equals(e2.getClass())){
                    return ELEMENT_ROW;//返回1，行可消
                }
            }
        }
        //判断纵向
        if(row>=2){
            Element e1 = elements[row - 1][col];//获取当前元素上面一个
            Element e2 = elements[row - 2][col];
            if(e!=null&&e1!=null&&e2!=null){
                if(e.getClass().equals(e1.getClass())&&e.getClass().equals(e2.getClass())){
                    return ELEMENT_COL;//返回2，列可消
                }
            }
        }
        return ELEMENT_NON;//返回0，没有可消元素

    }
    //添加元素到数组
    public void fillAllElements() {
        for (int row = 0; row < ROWS; row++) {//行
            for (int col = 0; col < COLS; col++) {//列
                do{
                    Element e = creatElement(row,col);//创建元素
                    elements[row][col]=e;//添加到elements数组中
                }while (canEliminate(row,col)!=ELEMENT_NON);//若可消则重新生成

            }
        }
    }

    //判断相邻（能否交换）
    public boolean isAdjacent(){
        //若行相邻且列相同 或者 列相邻且行相同
        if((Math.abs(firstRow-secondRow)==1)&&firstCol==secondCol||
                (Math.abs(firstCol-secondCol)==1)&&firstRow==secondRow){
            return true;//相邻
        }else {
            return false;//不相邻
        }
    }

    //移动两个元素（动画）
    public void moveElement(){
        if(firstRow==secondRow){
            //行相同横向移动
            int x1 = firstCol * ELEMENT_SIZE + OFFSET;
            int x2 = secondCol * ELEMENT_SIZE + OFFSET;
            int y = firstRow * ELEMENT_SIZE + OFFSET;
            int step=x1<x2?4:-4;

                for(int i=0;i<15;i++){//走15次
                    //每执行一次for停10毫秒
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    x1+=step;
                    x2-=step;
                    elements[firstRow][firstCol].setX(x1);
                    elements[secondRow][secondCol].setX(x2);
                 /**/   repaint();
                }

        }
        if(firstCol==secondCol){
            //列相同纵向移动
            int x = firstCol * ELEMENT_SIZE + OFFSET;
            int y1 = firstRow * ELEMENT_SIZE + OFFSET;
            int y2 = secondRow * ELEMENT_SIZE + OFFSET;
            int step=y1<y2?4:-4;

            for(int i=0;i<15;i++){//走15次
                //每执行一次for停10毫秒
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                y1+=step;
                y2-=step;
                elements[firstRow][firstCol].setY(y1);
                elements[secondRow][secondCol].setY(y2);
                repaint();
            }
        }
    }
    //交换数组元素索引
    public void swap(){
        Element e1=elements[firstRow][firstCol];
        Element e2=elements[secondRow][secondCol];

        elements[firstRow][firstCol]=e2;//将第一个选中的元素修改为第二个
        elements[secondRow][secondCol]=e1;//将第二个选中的元素修改为第一个

    }

    //元素下落
    public void down(){
        for (int row = ROWS - 1; row >= 0; row--) {//倒着遍历行
            while (true){
                int[] nullCol = new int[COLS];//存储当前行有为null的列,说明该列需要进行元素下落
                int num = -1;//没有元素的数组下标
                for (int col = COLS - 1; col >= 0; col--) {//倒着遍历列
                    Element e = elements[row][col];//获取当前元素
                    if (e == null){//当前元素为null,则存入nullCol中
                        num++;
                        nullCol[num] = col;//将列号存入数组中
                    }
                }

                if (num >= 0){//说明当前行有需要下落元素的列
                    for (int i = 0; i < 15; i++) {//走15次（每次走4，15*4=60）
                        for (int j = 0; j <= num; j++) {//将所有为null的列进行元素下落
                            int c = nullCol[j];//需要下落元素的列
                            for (int k = row - 1; k >= 0; k--) {//从当前元素的上一行开始下落元素
                                Element e = elements[k][c];//获取当前元素
                                if (e != null){//不为null,步长加4向下移动
                                    e.setY(e.getY() + 4);
                                }

                            }
                        }
                        //每执行一个停10毫秒
                        try {
                            Thread.sleep(10);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        repaint();//重画
                    }

                    for (int i = 0; i <= num; i++) {//遍历存储为null列的数组
                        int c = nullCol[i];//获取为null的列号
                        for (int j = row; j > 0; j--) {
                            elements[j][c] = elements[j - 1][c];//将该元素上一行的元素复制给它
                        }
                        elements[0][c] = creatElement(0,c);//在当前列的第一行随机生成新的元素
                    }

                }else {//没有需要下落的元素，结束循环
                    break;
                }
            }
        }
    }

    //判断消除元素
    public void eliminate(){

        for (int row = 7; row >= 0; row--) {//行
            for (int col=5; col >=0; col--) {//列
                int numX = 0;
                int numY = 0;
                Element e = elements[row][col];
                if(e==null){
                    continue;
                }else{

                        for (int j = col - 1; j >= 0; j--) {//当前行遍历
                            if (elements[row][j ] != null) {
                                if (e.getClass() == elements[row][j ].getClass()) {
                                    numX++;
                                } else {
                                    break;
                                }
                            }
                        }

                        for(int i=row-1;i>=0;i--){//当前列遍历
                            if(elements[i][col]!=null){
                                if(e.getClass()==elements[i][col].getClass()){
                                    numY++;
                                }else {
                                    break;
                                }
                            }
                        }

                        if (numX >=2) {
                            //numX=3
                            for (int i = 0; i < numX; i++) {
                                elements[row][col-i].setEliminated(true);
                                System.out.println("行可消");
                                //elements[row][col-i] = null;
                            }
                        }
                        if (numY >= 2) {
                            //numY=3
                            for (int i=0; i<numY; i++) {
                                elements[row-i][col].setEliminated(true);
                                System.out.println("列可消");
                                //elements[row-i][col] = null;
                            }
                        }


                        if (numX >=2) {
                            //numX=3
                            for (int i = 0; i <= numX; i++) {
                                //elements[row][col-i].setEliminated(true);
                                elements[row][col-i] = null;
                            }
                            for (int i = 0; i < Images.bombs.length; i++) {//遍历爆炸图
                                //每执行一个停80毫秒
                                try {
                                    Thread.sleep(80);
                                }catch (InterruptedException e2){
                                    e2.printStackTrace();
                                }
                                repaint();//重画
                            }
                        }
                        if (numY >= 2) {
                            //numY=3
                            for (int i=0; i<=numY; i++) {
                                //elements[row-i][col].setEliminated(true);
                                elements[row-i][col] = null;
                            }
                            for (int i = 0; i < Images.bombs.length; i++) {//遍历爆炸图
                                //每执行一个停80毫秒
                                try {
                                    Thread.sleep(80);
                                }catch (InterruptedException e2){
                                    e2.printStackTrace();
                                }
                                repaint();//重画
                            }
                        }
                    }

            }
        }

    }

    private boolean canInteractive=true;//可交互的状态
    private int selectedNumber=0;//已经选中的元素个数

    private int firstRow=0;//第一个选中元素行数
    private int firstCol=0;//第一个选中元素列数
    private int secondRow=0;
    private int secondCol=0;


    //启动程序执行
    public void start(){
        fillAllElements();
        MouseAdapter adapter=new MouseAdapter() {
            //重写鼠标点击时间
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!canInteractive){
                    //不可交互，不响应
                    return;
                }
                canInteractive=false;//只要选中元素，就先将状态改为不可交互
                int row=(e.getY()-OFFSET)/ELEMENT_SIZE;//获取元素的ROW
                int col=(e.getX()-OFFSET)/ELEMENT_SIZE;//获取元素的COL
                System.out.println(row+","+col);

                selectedNumber++;//选中元素个数增1
                if(selectedNumber==1){
                    firstRow=row;//记录第一个选中元素的row
                    firstCol=col;
                    elements[firstRow][firstCol].setSelected(true);//设置选中状态

                    canInteractive=true;//可交互了
                }else if(selectedNumber==2){//第二次选中
                    secondRow=row;//记录第二个选中元素的row
                    secondCol=col;
                    elements[secondRow][secondCol].setSelected(true);//设置选中状态
                    if(isAdjacent()){ //相邻
                        new Thread(){
                            @Override
                            public void run() {
                                //线程要执行的任务
                                elements[firstRow][firstCol].setSelected(false);//取消选中状态
                                elements[secondRow][secondCol].setSelected(false);//取消选中状态

                                moveElement();//交换移动两个元素

                                swap();//交换数组索引
                                while (true) {
                                    eliminate();//消除(数组下标设为null)上面的元素全部往下移
                                    down();
                                    canInteractive=true;//可交互了
                                }



                            }
                        }.start();


                    }else{ //不相邻
                        //取消选中状态
                        elements[firstRow][firstCol].setSelected(false);//取消选中状态
                        elements[secondRow][secondCol].setSelected(false);//取消选中状态
                        canInteractive=true;
                    }

                    selectedNumber=0;//选中个数归零
                }
                repaint();
            }
        };
        this.addMouseListener(adapter);//添加鼠标监听
    }


    //重写paint
    @Override
    public void paint(Graphics g) {
        Images.background.paintIcon(null,g,0,0);//画背景图
        for (int row = 0; row < ROWS; row++) {//行
            for(int col=0;col<COLS;col++) {//列
                Element e = elements[row][col];
                if (e != null) {
                    e.paintElement(g);//画元素
                }
            }
        }
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame();
        World world = new World();//创建窗口中的那一堆对象
        world.setFocusable(true);// 将控件设置成可获取焦点状态
        frame.add(world);
        //设置用户在此窗体上发起 "close" 时默认执行的操作，EXIT_ON_CLOSE：使用 System exit 方法退出应用程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH,HEIGHT+17);
        frame.setLocationRelativeTo(null);//使窗口显示在屏幕中央
        frame.setVisible(true);//自动调用paint()方法

        world.start();
    }


}
