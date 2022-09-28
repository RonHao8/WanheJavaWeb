package com.wanhe.day08.demo;

/*
通过对象名去给成员变量赋值，可以赋值一些非法数据，这个是不合理的
解决方案：在赋值之前，先对数据进行判断
判断到底写在哪里呢？
StudentDemo是一个测试类，测试类一般只创建对象，调用方法，所以这个判断逻辑应该写在Student类中
因为要做数据的校验，必须要依靠一些业务逻辑语句，逻辑语句都是定义在方法中，
所以要在Student中提供一个方法来对数据进行校验

方法定义之后，如果不使用该方法进行赋值，还是有问题存在
强制要求不能直接使用对象名对成员进行赋值，针对于这种情况，java就提供了一个关键字:private

private：私有的，可以修饰成员变量和成员方法
被private修饰的成员只能在本类中使用

封装：是指隐藏对象的属性和实现的细节，仅对外提供公共的访问方式
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student();
        s.show();

        System.out.println("=================");
        //给成员变量赋值
        s.name = "林青霞";
        //s.age = 65;
        s.show();

        System.out.println("=================");

        //s.age = -27;//这个数据是不合理的
        s.setAge(27);
        s.show();
        System.out.println(s.getAge());
    }
}
