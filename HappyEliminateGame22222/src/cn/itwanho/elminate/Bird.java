package cn.itwanho.elminate;

import javax.swing.*;

public class Bird extends Element {

    public Bird(int x, int y) {
        super(x, y);
    }

    @Override
    public ImageIcon getImage() {
        return Images.bird;
    }
}
