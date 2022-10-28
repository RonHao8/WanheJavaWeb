package cn.itwanho.eliminate;

import javax.swing.*;

//图片类
public class Images {
    public static  ImageIcon background;//背景图
    public static  ImageIcon bear;//小熊图
    public static  ImageIcon bird;//鸟图
    public static  ImageIcon fox;//狐狸图
    public static  ImageIcon frog;//青蛙图
    public static  ImageIcon[] bombs;//爆炸数组图

    static {
        background = new ImageIcon("img/background.png");
        bear = new ImageIcon("img/bear.png");
        bird = new ImageIcon("img/bird.png");
        fox = new ImageIcon("img/fox.png");
        frog = new ImageIcon("img/frog.png");
        bombs = new ImageIcon[4];
        for(int i = 0;i<bombs.length;i++){
            bombs[i]= new ImageIcon("img/bom"+( i + 1) + ".png");
        }
    }

    public static void main(String[] args) {
        //getImageLoadStatus方法返回值是8，表示读取图片成功，否则失败
        System.out.println(background.getImageLoadStatus());
    }
}
