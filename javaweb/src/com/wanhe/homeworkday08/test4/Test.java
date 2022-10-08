package com.wanhe.homeworkday08.test4;

public class Test {
    public static void main(String[] args) {
        Cucumber cuc = new Cucumber();
        cuc.setColour("黄色");
        cuc.setWeight(0.9);
        System.out.println("黄瓜颜色："+cuc.getColour()+",黄瓜重量："+cuc.getWeight()+"g");
        cuc.eat();
        cuc.use();
        System.out.println("---------------------专用分割线---------------------");
        Eggplant egg = new Eggplant();
        egg.setColour("紫色");
        egg.setWeight(1.5);
        System.out.println("茄子颜色："+egg.getColour()+",茄子重量："+egg.getWeight()+"g");
        egg.eat();
        egg.use();
        System.out.println("---------------------专用分割线---------------------");
        Banana ban = new Banana();
        ban.setColour("黄色");
        ban.setWeight(0.2);
        System.out.println("香蕉颜色："+ban.getColour()+",香蕉重量："+ban.getWeight()+"g");
        ban.eat();
        ban.use();
        System.out.println("---------------------专用分割线---------------------");
        Durian dur = new Durian();
        dur.setColour("黄色");
        dur.setWeight(6.78);
        System.out.println("榴莲颜色："+dur.getColour()+",榴莲重量："+dur.getWeight()+"g");
        dur.eat();
        dur.use();
        System.out.println("---------------------专用分割线---------------------");
        System.out.println("---------------------专用分割线---------------------");
        Ricefield ric = new Ricefield();
        ric.setWeight(93.56);
        ric.setBreed("九级龙血脉");
        ric.setPrice(999.99);
        System.out.println("黄鳝重量："+ric.getWeight()+",黄鳝品种："+ric.getBreed()+",黄鳝价格："+ric.getPrice()+"kg");
        ric.eat();
        System.out.println("---------------------专用分割线---------------------");
        Hairtail hai = new Hairtail();
        hai.setWeight(6.78);
        hai.setBreed("一级血脉");
        hai.setPrice(18.9);
        System.out.println("带鱼重量："+hai.getWeight()+",带鱼品种："+hai.getBreed()+",带鱼价格："+hai.getPrice()+"kg");
        hai.eat();
    }
}
