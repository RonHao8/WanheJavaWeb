package cn.itwanho.eliminate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Random;

//窗口类
public class World extends JPanel {
    public  static final int WIDTH =429;//窗口的宽度(和背景图宽高保持一致)
    public  static final int HEIGHT =570;//窗口的高

    public static  final int ROWS = 8;//8行
    public static  final int COLS = 6;//6列

    public static final int ELEMENT_SIZE = 60;//元素大小（宽高60px）

    public static final int OFFSET = 30;//偏移量（第一个元素距离窗口左边和上边的边缘的距离）

    private Element [] [] elements = new Element[ROWS][COLS];//元素数组（8行6列）


    /*
    创建元素
     row:0    col:0      x:30    y:30
     row:0    col:1      x:90    y:30
     row:0    col:2      x:150   y:30
     row:2    col:1      x:90    y:150
     int x = OFFSET +col*ELEMENT_SIZE;
     int y = OFFSET +row*ELEMENT_SIZE;
     */
    //元素类型
    public static final  int ELEMENT_TYPE_BEAR=0;//小熊
    public static final  int ELEMENT_TYPE_BIRD=1;//小鸟
    public static final  int ELEMENT_TYPE_FOX=2;//狐狸
    public static final  int ELEMENT_TYPE_FROG=3;//青蛙

    public Element creatElement(int row,int col){
        int x = OFFSET +col*ELEMENT_SIZE;
        int y = OFFSET +row*ELEMENT_SIZE;

        Random rand = new Random();//随机数对象
        int type = rand.nextInt(4);//0-之间随机数
        switch (type){//根据type值的不同
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
    public static final int ELEMENT_NON = 0 ;//不可消
    public static final int ELEMENT_ROW = 1 ;//行可消
    public static final int ELEMENT_COL = 2 ;//列可消

    //检查元素是否可消  返回值是元素的可消状态（0，1，2）
    public  int canEliminate(int row,int col){
        Element e = elements[row][col];//获取当前元素(0,2)
        //判断横向
        if (col >= 2){
            //(0,1)
           Element e1 = elements[row][col - 1];//获取当前元素前面第一个元素(0,1)
           Element e2 = elements[row][col - 2];//获取当前元素前面第二个元素(0,0)
            if (e != null && e1 != null && e2 != null){
                //若当前元素与其他两个元素类型都相同
                if (e.getClass().equals(e1.getClass()) && e.getClass().equals(e2.getClass())) {
                    return ELEMENT_ROW;//返回1，表示行可消
                }
            }
        }
        //判断纵向      (2,0)
        if (row >= 2){
            //(1,0)
            Element e1 = elements[row - 1][col];//获取当前元素上面的第一个元素(1,0)
            Element e2 = elements[row - 2][col];//获取当前元素上面的第二个元素(0,0)
            if (e != null && e1 != null && e2 != null){
                //若当前元素与其他两个元素类型都相同
                if (e.getClass().equals(e1.getClass()) && e.getClass().equals(e2.getClass())) {
                    return ELEMENT_COL;//返回2，表示列可消
                }
            }
        }
        return ELEMENT_NON;//返回0，表示不可消
    }

    //填充所有元素到数组中
    public void fillAllElement(){
        for (int row = 0; row < ROWS; row++) {//遍历所有的行
            for(int col = 0;col < COLS;col ++){//遍历所有的列
                do {
                    Element e = creatElement(row,col);//创建元素
                    elements[row][col] = e;//将元素填充到element数组中
                }while (canEliminate(row,col) != ELEMENT_NON);//若可消则重新生成新的元素
            }
        }
    }

    //判断两个元素是否能交换（相邻则交换，否则不交换）
    public boolean isAdjacent(){
        //若行相邻并且列相等或者列相邻并且行相等
        if (Math.abs(firstRow-secondRow) == 1 && firstCol == secondCol ||
                (Math.abs(firstCol-secondCol) == 1 && firstRow == secondRow)){
            return true;//相邻
        }else {
            return false;//不相邻
        }
    }

    //移动两个元素（动画移动）
    public void moveElement(){
        if (firstRow == secondRow){//若行号相同，表示左右移动
            int firstX = OFFSET + firstCol * ELEMENT_SIZE;//第一个元素的x坐标
            int secondX = OFFSET + secondCol * ELEMENT_SIZE;//第二个元素的x坐标

            int step = firstX < secondX ? 4:-4;//步长，值越大，移动的速度就越快

            for (int i = 0; i < 15; i++){//走15次（每次走4，15*4=60）
                //每执行一个停10毫秒
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                firstX += step;
                secondX -= step;
                elements[firstRow][firstCol].setX(firstX);
                elements[secondRow][secondCol].setX(secondX);
                repaint();//重画
            }
        }

        if (firstCol == secondCol){//若列号相同，表示上下移动
            int firstY = OFFSET + firstRow * ELEMENT_SIZE;//第一个元素的y坐标
            int secondY = OFFSET + secondRow * ELEMENT_SIZE;//第二个元素的y坐标

            int step = firstY < secondY ? 4:-4;
            for (int i = 0; i < 15; i++) {
                //每执行一个停10毫秒
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                firstY += step;
                secondY -= step;
                elements[firstRow][firstCol].setY(firstY);
                elements[secondRow][secondCol].setY(secondY);
                repaint();//重画
            }
        }
    }

    //交换两个元素
    public void exchangeElement(){
        Element temp = elements[firstRow][firstCol];
        elements[firstRow][firstCol] = elements[secondRow][secondCol];
        elements[secondRow][secondCol] = temp;
    }


    //消除
    //消元素功能的实现思路：
    //1)查找一行中连续的个数，查找一列是连续的个数
    //2)将连续(可消除)的元素设计为可消除状态
    //3)将可消状态的元素绘制爆炸动画
    //4)将可消状态元素设置为null，以等待其它元素的下落
    public boolean deleteElements(){
        boolean haveElement = false;
        for (int row = ROWS - 1; row >= 0; row--) {//倒着遍历行
            for (int col = COLS - 1; col >= 0; col--) {//倒着遍历列
                if (elements[row][col] == null){//元素为null,则跳过本次循环
                    continue;
                }else {//不为null
                    Element e = elements[row][col];//获取当前元素

                    //1)查找一行中连续的个数
                    int rowNum = 0;//该行与当前元素相同元素的个数
                    for (int i = col - 1; i >= 0 ; i--) {//倒着遍历当前元素前面的元素
                        if (elements[row][i] == null){//元素为null，直接结束当前for循环
                            break;
                        }
                        if (e.getClass() == elements[row][i].getClass()){//前面的元素与当前元素相同
                            rowNum++;//该行与当前元素相同元素的个数+1
                        }else {//不相同,直接结束当前for循环
                            break;
                        }
                    }

                    //查找一列是连续的个数
                    int colNum = 0;//该列相同元素的个数
                    for (int i = row - 1; i >= 0 ; i--) {//倒着遍历当前元素上面的元素
                        if (elements[i][col] == null){//元素为null，直接结束当前for循环
                            break;
                        }
                        if (e.getClass() == elements[i][col].getClass()){//上面的元素与当前元素相同
                            colNum++;//该列与当前元素相同元素的个数+1
                        }else {//不相同,直接结束当前for循环
                            break;
                        }
                    }

                    //2)将连续(可消除)的元素设计为可消除状态
                    if (rowNum >= 2){//当前行有三个以上相同并且相邻的元素
                        elements[row][col].setEliminated(true);//将当前元素设置为可消状态
                        for (int i = 0; i < rowNum; i++) {//将当前行与当前元素相邻且相邻的元素设置为可消状态
                            elements[row][col - 1 - i].setEliminated(true);
                        }
                    }
                    if (colNum >= 2){//当前列有三个以上相同并且相邻的元素
                        elements[row][col].setEliminated(true);//将当前元素设置为可消状态
                        for (int i = 0; i < colNum; i++) {//将当前列与当前元素相邻且相邻的元素设置为可消状态
                            elements[row - 1 - i][col].setEliminated(true);
                        }
                    }

                    //3)将可消状态的元素绘制爆炸动画
                    if (rowNum >= 2 || colNum >= 2){//元素可消
                        for (int i = 0; i < Images.bombs.length; i++) {//遍历爆炸图
                            repaint();//重画
                            //每执行一个停80毫秒
                            try {
                                Thread.sleep(80);
                            }catch (InterruptedException e2){
                                e2.printStackTrace();
                            }
                        }
                    }


                    //4)将可消状态元素设置为null，以等待其它元素的下落
                    if (rowNum >= 2){//当前行有三个以上相同并且相邻的元素
                        elements[row][col] = null;//将当前元素设置为null,即被消除
                        for (int i = 0; i < rowNum; i++) {//将当前行与当前元素相邻且相邻的元素设置为null,即被消除
                            elements[row][col - 1 - i] = null;
                        }
                        haveElement = true;
                    }
                    if (colNum >= 2){//当前列有三个以上相同并且相邻的元素
                        elements[row][col] = null;//将当前元素设置为null,即被消除
                        for (int i = 0; i < colNum; i++) {//将当前列与当前元素相邻且相邻的元素设置为null,即被消除
                            elements[row - 1 - i][col] = null;
                        }
                        haveElement = true;
                    }
                }
            }
        }
        return haveElement;
    }


    //元素下落
    public void downElement(){
        for (int row = ROWS - 1; row >= 0; row--) {//倒着遍历行
            while (true){
                int[] nullCol = {};//当前行为null的列
                for (int col = COLS - 1; col >= 0; col--) {//倒着遍历列
                    Element e = elements[row][col];//获取当前元素
                    if (e == null){//当前元素为null
                        nullCol = Arrays.copyOf(nullCol,nullCol.length + 1);
                        nullCol[nullCol.length - 1] = col;//将列号存入数组中

                    }
                }

                if (nullCol.length > 0){//说明需要下落元素
                    for (int i = 0; i < 15; i++) {//走15次（每次走4，15*4=60）
                        for (int j = 0; j < nullCol.length; j++) {//将所有为null的列进行元素下落
                            int c = nullCol[j];//需要下落元素的列
                            for (int k = row - 1; k >= 0; k--) {//从当前元素的上一行开始下落元素
                                Element e = elements[k][c];
                                if (e != null){
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

                    for (int i = 0; i < nullCol.length; i++) {
                        int c = nullCol[i];
                        for (int j = row; j > 0; j--) {
                            elements[j][c] = elements[j - 1][c];
                        }
                        elements[0][c] = creatElement(0,c);
                    }

                }else {//没有需要下落的元素，结束循环
                    break;
                }
            }
        }
    }

    private boolean canInteractive = true;//可交互的状态（默认可交互）,一轮没有消完之前，点鼠标应该无反应
    private int selectedNumber = 0;//已经选中的元素的个数
    private int firstRow = 0;//第一个选中元素的ROW
    private int firstCol = 0;//第一个选中元素的COL
    private int secondRow = 0;//第二个选中元素的ROW
    private int secondCol = 0;//第二个选中元素的COL

    //启动程序执行
    public void start(){
        fillAllElement();//填充所有元素

        MouseAdapter adapter = new MouseAdapter(){
            //重写鼠标点击事件
            @Override
            public void mouseClicked(MouseEvent e) {
                //System.out.println(111);
                if (!canInteractive){//不可交互，不响应鼠标点击
                    return;
                }
                canInteractive = false;//只要选中元素，就先将状态改为不可交互

                int row = (e.getY()-OFFSET)/ELEMENT_SIZE;//获取选中元素的ROW
                int col = (e.getX()-OFFSET)/ELEMENT_SIZE;//获取选中元素的COL

                //System.out.println(e.getX()+","+e.getY()+"------"+row+","+col);


                selectedNumber++;//选中元素个数增1
                if (selectedNumber == 1){//第一次选中
                    firstRow = row;//记录第一个元素的ROW
                    firstCol = col;//记录第一个元素的COL
                    elements[firstRow][firstCol].setSelected(true);//设置选中状态


                    canInteractive = true;//可交互
                }else if (selectedNumber == 2){//第二次选中
                    secondRow = row;//记录第二个元素的ROW
                    secondCol = col;//记录第二个元素的COL
                    elements[secondRow][secondCol].setSelected(true);//设置选中状态

                    if (isAdjacent()){//若相邻
                        //移动、换、消
                        new Thread(){
                            @Override
                            public void run() {//自动执行
                                //线程要执行的任务
                                //......
                                elements[firstRow][firstCol].setSelected(false);//取消选中状态
                                elements[secondRow][secondCol].setSelected(false);//取消选中状态
                                moveElement();//移动两个元素（动画移动）
                                exchangeElement();//交换两个元素
                                //
                                if (deleteElements()){
                                    do {
                                        downElement();
                                        //每执行一个停10毫秒
                                        try {
                                            Thread.sleep(10);
                                        }catch (InterruptedException e){
                                            e.printStackTrace();
                                        }
                                    }while (deleteElements());
                                }else {
                                    moveElement();
                                    exchangeElement();
                                }
                                deleteElements();//消除
                                canInteractive=true;//可交互
                            }
                        }.start();//启动线程
                    }else {//不相邻
                        elements[firstRow][firstCol].setSelected(false);//取消选中状态
                        elements[secondRow][secondCol].setSelected(false);//取消选中状态
                        canInteractive = true;
                    }

                    //canInteractive = true;//可交互
                    selectedNumber = 0;//选中个数归0
                }
                repaint();//重画(调用paint方法)
            }
        };


        this.addMouseListener(adapter);//添加鼠标监听
    }



    //  重写Paint g:画笔
    @Override
    public void paint(Graphics g) {
        Images.background.paintIcon(null,g,0,0);//画背景图
        for (int row = 0; row < ROWS; row++) {//遍历所有的行
            for(int col = 0;col < COLS;col ++){//遍历所有的列
                Element e = elements[row][col];
                if(e != null){//如果元素不是null
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

        world.start();//启动程序执行
    }

}
