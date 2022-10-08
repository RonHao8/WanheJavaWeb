package com.wanhe.day11;

/*
抽象类注意事项：
    一个类中没有抽象方法，可不可以定义为抽象类？如果可以，有何意义？
        可以，不让直接创建对象
    abstract不能和哪些关键字共存？
        private 冲突（抽象是为了重写，私有无法继承，那无法重写）
        final 冲突（final修饰方法，该方法不能被重写）
        static 无意义（静态方法可以直接通过类名调用，调用一个没有方法体的方法无意义）

 */
abstract class Fu{
    public abstract void show();
    //private abstract void show();
    //final abstract void show();
    //static abstract void show();

}
class Zi extends Fu{
    @Override
    public void show() {

    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        //Fu f = new Fu();
        //Fu.show();//调用了一个没有方法体的方法
    }
}
