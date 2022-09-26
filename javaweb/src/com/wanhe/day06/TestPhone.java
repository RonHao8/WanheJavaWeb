package com.wanhe.day06;

public class TestPhone {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();

        p.brand = "华为Mate50 pro";
        p.price = 8999;

        System.out.println(p.brand);
        System.out.println(p.price);

        //调用方法
        p.call("任正非");
        p.sendMessage("任正非");


        Phone iphone = new Phone();
        iphone.brand = "iphone14 pro";
        iphone.price = 7999;
        System.out.println(iphone.brand);
        System.out.println(iphone.price);
        iphone.call("乔布斯");
        iphone.sendMessage("乔布斯");


    }
}
