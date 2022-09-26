package com.wanhe.day06;

/*
通过学生类创建具体的学生对象

Scanner -->Scanner sc = new Scanner(System.in);
Random-->Random r = new Random();
Student -->Student s = new Student();
 */
public class TestStudent {
    public static void main(String[] args) {
        //创建对象的格式：类名 对象名 = new 类名();
        Student stu = new Student();

        //调用成员变量：对象名.变量名
        System.out.println(stu.age);//0
        System.out.println(stu.name);//null

        stu.age = 23;
        stu.name = "张三";

        System.out.println(stu.age);//23
        System.out.println(stu.name);//张三

        //调用成员方法：对象名.方法名
        stu.study();//执行study方法中的方法体内容
    }
}
