package com.wanhe.day12.demo01;

import com.wanhe.homeworkday08.test2.Mammal;

/*
记忆；
类与类：
    继承关系，只能是单继承，可以多层继承
类与接口：
    实现关系，可以实现单实现，也可以实现多实现
接口与接口：
    继承关系：可以单继承，也可以多继承
 */
interface Father{
    public abstract void show();
}

interface Mather{
    public abstract void show2();
}
//接口与接口：多继承
interface Sister extends Father,Mather{

}

//类与接口：多实现
class Son implements Father, Mather{
    @Override
    public void show() {

    }

    @Override
    public void show2() {

    }
}

public class InterfaceDemo {
}
