package com.wanhe.day06;

public class Phone {
    //属性：品牌，价格
    String brand;//null
    int price;//0

    //行为：打电话、发短信
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage(String name){
        System.out.println("给"+name+"发短信");
    }
}
