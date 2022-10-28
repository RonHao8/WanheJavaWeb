package cn.itwanho.elminate;

import javax.swing.*;

public class Fox extends Element{

    public Fox(int x, int y) {
        super(x, y);
    }

    @Override
    public ImageIcon getImage() {
        return Images.fox;
    }
}
