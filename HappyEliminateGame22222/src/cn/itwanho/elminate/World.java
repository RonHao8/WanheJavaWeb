package cn.itwanho.elminate;

import com.sun.rowset.internal.Row;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Random;

import static sun.misc.PostVMInitHook.run;

//窗口类
public class World extends JPanel {
    public static final int WIDTH = 429;//窗口的宽度(和背景图宽高保持一致)
    public static final int HEIGHT = 570;//窗口的高

    public static final int ROWS = 8;//8行
    public static final int COLS = 6;//6列

    public static final int ELEMENT_SIZE = 60;//元素大小（宽高60px）、

    public static final int OFFSET = 30;//偏移量（第一个元素距离窗口左边和上边的边缘的距离）

    private Element[][] elements = new Element[ROWS][COLS];//元素数组（8行6列）

    public static int number = 0;
    public static String str="积分："+number;


    /**
     * 创建元素
     * row:0    col:0      x:30    y:30
     * row:0    col:1      x:90    y:30
     * row:0    col:2      x:150   y:30
     * row:2    col:1      x:90    y:150
     * int x = OFFSET +col*ELEMENT_SIZE;
     * int y = OFFSET +row*ELEMENT_SIZE;
     *
     * @param g
     */
    //元素类型
    public static final int ELEMENT_TYPE_BEAR = 0;//小熊
    public static final int ELEMENT_TYPE_BIRD = 1;//小鸟
    public static final int ELEMENT_TYPE_FOX = 2;//狐狸
    public static final int ELEMENT_TYPE_FROG = 3;//青蛙

    public Element creatElement(int row, int col) {
        int x = OFFSET + col * ELEMENT_SIZE;
        int y = OFFSET + row * ELEMENT_SIZE;

        Random rand = new Random();//随机数对象
        int type = rand.nextInt(4);//0-之间随机数
        switch (type) {//根据type值的不同
            case ELEMENT_TYPE_BEAR:
                return new Bear(x, y);
            case ELEMENT_TYPE_BIRD:
                return new Bird(x, y);
            case ELEMENT_TYPE_FOX:
                return new Fox(x, y);
//            case ELEMENT_TYPE_FROG:
//                return new Frog(x,y);
            default:
                return new Frog(x, y);
        }

    }

    public void moveElement() {
        if (firstRow == secondRow) {
            int firstX = OFFSET + firstCol * ELEMENT_SIZE;
            int secondX = OFFSET + secondCol * ELEMENT_SIZE;

            int step = firstX < secondX ? 4 : -4;

            for (int i = 0; i < 15; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                firstX += step;
                secondX -= step;
                elements[firstRow][firstCol].setX(firstX);
                elements[secondRow][secondCol].setX(secondX);
                repaint();
            }
        }
        if (firstCol == secondCol) {
            int firstY = OFFSET + firstRow * ELEMENT_SIZE;
            int secondY = OFFSET + secondRow * ELEMENT_SIZE;

            int step = firstY < secondY ? 4 : -4;
            for (int i = 0; i < 15; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                firstY += step;
                secondY -= step;
                elements[firstRow][firstCol].setY(firstY);
                elements[secondRow][secondCol].setY(secondY);
                repaint();

            }
        }

    }

    //交换
    public void exchangeElement() {
        Element e1 = elements[firstRow][firstCol];
        Element e2 = elements[secondRow][secondCol];
        elements[firstRow][firstCol] = e2;
        elements[secondRow][secondCol] = e1;
    }

    public boolean elimnateElement() {
        boolean haveEliminated = false;
        for (int row = ROWS - 1; row >= 0; row--) {
            for (int col = COLS - 1; col >= 0; col--) {
                Element e = elements[row][col];
                if (e == null) {
                    continue;
                }

                int colRepeat = 0;
                for (int i = col - 1; i >= 0; i--) {
                    if (elements[row][i] == null) {
                        break;
                    }
                    if (elements[row][i].getClass() == e.getClass()) {
                        colRepeat++;
                    } else {
                        break;
                    }
                }
                    int rowRepeat = 0;
                    for (int j = row - 1; j >=0 ; j--) {
                    if (elements[j][col]==null) {
                        break;
                    }
                    if (elements[j][col].getClass()==e.getClass()){
                        rowRepeat++;
                    }else {
                        break;
                    }
                    }


                if (colRepeat >= 2) {
                    number= number+colRepeat+1;
                    elements[row][col].setEliminated(true);
                    for (int i = 1; i <= colRepeat; i++) {
                        elements[row][col - i].setEliminated(true);
                    }
                }
                if (rowRepeat >= 2) {
                    number=number+rowRepeat+1;
                    elements[row][col].setEliminated(true);
                    for (int i = 1; i <= rowRepeat; i++) {
                        elements[row-i][col].setEliminated(true);
                    }
                }
                if (rowRepeat >= 2 || colRepeat >= 2){//元素可消
                    for (int i = 0; i < Images.bombs.length; i++) {//遍历爆炸图
                        str="积分："+number*10;
                        repaint();//重画爆炸图
                        //每执行一个停100毫秒
                        try {
                            Thread.sleep(100);
                        }catch (InterruptedException e2){
                            e2.printStackTrace();
                        }
                    }
                }
                if (colRepeat >= 2) {
                    for (int i = 0; i < Images.bombs.length; i++) {
                        repaint();
                    }
                    elements[row][col] = null;
                    for (int i = 0; i <= colRepeat; i++) {
                        elements[row][col - i] = null;
                    }
                    haveEliminated = true;
                }
                if (rowRepeat >= 2) {
                    for (int i = 0; i < Images.bombs.length; i++) {
                        repaint();
                    }
                    elements[row][col] = null;
                    for (int i = 0; i <= rowRepeat; i++) {
                        elements[row - i][col] = null;
                    }
                    haveEliminated = true;
                }


            }
        }
        return haveEliminated;
    }

    public void dropElement(){
        for (int row = ROWS-1;row>=0;row--){
            while (true){
                int[] nullCols = {};
                for (int col = COLS-1;col>=0;col--){
                    Element e = elements[row][col];
                    if (e == null){
                        nullCols = Arrays.copyOf(nullCols,nullCols.length+1);
                        nullCols[nullCols.length-1] = col;
                    }
                }

                if (nullCols.length>0){
                    for (int count = 0;count<15;count++){
                        for (int i = 0; i < nullCols.length; i++) {
                            int x = nullCols[i];
                            for (int y =row-1;y>=0;y--){
                                Element e = elements[y][x];
                                if (e!=null){
                                    e.setY(e.getY()+4);
                                }
                            }
                        }
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        repaint();
                    }
                    for (int i = 0; i < nullCols.length; i++) {
                        int x =nullCols[i];
                        for (int y = row;y>0;y--){
                            elements[y][x] = elements[y-1][x];
                        }
                        elements[0][x] = creatElement(0,x);
                    }

                }else{
                    break;
                }
            }
        }
    }

    public static final int ELEMENT_NON = 0;
    public static final int ELEMENT_ROW = 1;
    public static final int ELEMENT_COL = 2;

    public int canEliminate(int row, int col) {
        Element e = elements[row][col];
        if (col >= 2) {
            Element e1 = elements[row][col - 1];
            Element e2 = elements[row][col - 2];
            if (e != null && e1 != null && e2 != null) {
                if (e.getClass().equals(e1.getClass()) && e.getClass().equals(e2.getClass())) {
                    return ELEMENT_ROW;
                }
            }
        }
        if (row >= 2) {
            Element e1 = elements[row - 1][col];
            Element e2 = elements[row - 2][col];
            if (e != null && e1 != null && e2 != null) {
                if (e.getClass().equals(e1.getClass()) && e.getClass().equals(e2.getClass())) {
                    return ELEMENT_COL;
                }
            }
        }
        return ELEMENT_NON;
    }


    //填充所有元素到数组中
    public void fillAllElement() {
        for (int row = 0; row < ROWS; row++) {//遍历所有的行
            for (int col = 0; col < COLS; col++) {//遍历所有的列
                do {
                    Element e = creatElement(row, col);//创建元素
                    elements[row][col] = e;//将元素填充到element数组中
                } while (canEliminate(row, col) != ELEMENT_NON);
            }
        }
    }

    //判断两个元素是否能交换（相邻则交换，否则不交换）
    public boolean isAdjacent() {
        //若行相邻并且列相同或者列相邻并且行相等
        if (Math.abs(firstRow - secondRow) == 1 && firstCol == secondCol || (Math.abs(firstCol - secondCol) == 1 && firstRow == secondRow)) {
            return true;//相邻
        } else {
            return false;//不相邻
        }
    }

    private boolean canInteractive = true; //可交互的状态（默认可交互）一轮没有消完之前，点鼠标没有反应
    private int selectedNumber = 0;//已经选中的元素的个数
    private int firstRow = 0;//第一个选中的元素的ROW
    private int firstCol = 0;//第一个选中元素的COL
    private int secondRow = 0;//第二个选中元素的ROW
    private int secondCol = 0;//第二个选中元素的COL


    //启动程序
    public void start() {
        fillAllElement();//填充所有元素

        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                System.out.println(e.getX() +" "+ e.getY());
                if (!canInteractive) {//不可交互
                    return;
                }
                canInteractive = false;//只要选中元素。就先将状态改为不可交互

                int row = (e.getY() - OFFSET) / ELEMENT_SIZE;
                int col = (e.getX() - OFFSET) / ELEMENT_SIZE;
//                System.out.println(row + " " + col);

                selectedNumber++;//选中元素个数增1

                if (selectedNumber == 1) {//第一次选中
                    firstRow = row;//记录第一个元素的row
                    firstCol = col;//记录第一个元素的col
                    elements[firstRow][firstCol].setSelected(true);
                    canInteractive = true;//可交互

                } else if (selectedNumber == 2) {//第二次选中
                    secondRow = row;//记录第二个元素的row
                    secondCol = col;//记录第二个元素的col
                    elements[secondRow][secondCol].setSelected(true);

                    if (isAdjacent()) {//若相邻
                        //移动，换，消
                        new Thread() {
                            @Override
                            public void run() {
                                elements[firstRow][firstCol].setSelected(false);//取消选中状态
                                elements[secondRow][secondCol].setSelected(false);//取消选中状态
                                moveElement();
                                exchangeElement();
                                if (elimnateElement()) {
                                    do {
                                        dropElement();
                                        try {
                                            Thread.sleep(10);
                                        } catch (InterruptedException e1) {
                                            e1.printStackTrace();
                                        }
                                    } while (elimnateElement());
                                } else {
                                    moveElement();
                                    exchangeElement();
                                }
                                canInteractive = true;
                            }
                        }.start();

                    } else {//不相邻
                        elements[firstRow][firstCol].setSelected(false);//取消选中状态
                        elements[secondRow][secondCol].setSelected(false);//取消选中状态
                        canInteractive = true;

                    }

//                   canInteractive = true;//可交互
                    selectedNumber = 0;//选中个数归0
                }
                repaint();
            }
        };


        this.addMouseListener(adapter);//添加鼠标监听
    }

    //  重写Paint g:画笔
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Images.background.paintIcon(null, g, 0, 0);//画背景图
        g.setFont(new Font("宋体",Font.BOLD,20));
        g.setColor(Color.blue);
        g.drawString(str,20,20);
        for (int row = 0; row < ROWS; row++) {//遍历所有的行
            for (int col = 0; col < COLS; col++) {//遍历所有的列
                Element e = elements[row][col];
                if (e != null) {//如果元素不是null
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
        frame.setSize(WIDTH, HEIGHT + 17);
        frame.setLocationRelativeTo(null);//使窗口显示在屏幕中央
        frame.setVisible(true);//自动调用paint()方法

        world.start();//启动程序执行
    }

}
