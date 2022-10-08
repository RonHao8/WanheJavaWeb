package com.wanhe.day11.demo01;

/*
作文模板类
 */
public abstract class CompositionTemplate {
    public final void write(){//模板方法，一般都是去定义骨架，不允许更改的
        System.out.println("《我的爸爸》");

        //具体的内容
        body();

        System.out.println("啊，这就是我的爸爸");
    }

    public abstract void body();
}
