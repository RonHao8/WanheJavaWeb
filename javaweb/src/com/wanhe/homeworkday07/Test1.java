package com.wanhe.homeworkday07;

public class Test1 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("小米");
        p.setPrice(3998);
        p.setColor("黑色");
        p.show();
        p.call();
        p.show();
        p.sendMessage();
    }
}
