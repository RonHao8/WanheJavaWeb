package cn.itwanho.elminate;

import javax.swing.*;

public class Frog extends Element{

    public Frog(int x, int y) {
        super(x, y);
    }

    @Override
    public  ImageIcon getImage() {
        return Images.frog;
    }
}
