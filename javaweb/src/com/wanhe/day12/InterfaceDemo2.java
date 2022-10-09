package com.wanhe.day12;

/*
接口成员的特点：
    成员变量：
        只能是常量，并且这个常量是静态
        默认的修饰符：public static final
    构造方法：
        没有构造方法的，因为接口主要是扩展功能的，没有具体的存在
    成员方法：
        只能是抽象方法
        默认修饰符，public abstract
 */
interface Inner{
    int a = 20;//自动添加public static final
    public static final int num = 30;

    //public void show(){}//不能有普通方法

    //public abstract void show();

    public void show();//抽象方法，默认添加abstract
}
//接口名+Impl格式代表接口的实现类
class InnerImpl implements Inner{
    @Override
    public void show() {
        System.out.println("show");
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {

    }
}
