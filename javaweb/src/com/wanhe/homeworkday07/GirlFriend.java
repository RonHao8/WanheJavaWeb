package com.wanhe.homeworkday07;

public class GirlFriend {
    private String name;
    private double high;
    private double weight;

    public GirlFriend(){

    }

    public GirlFriend(String name,double high,double weight){
        this.name = name;
        this.high = high;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getHigh(){
        return high;
    }
    public void  setHigh(double high){
        this.high = high;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public void wash(){
        System.out.println(this.name+"帮我洗衣服");
    }
    public void cook(){
        System.out.println(this.name+"给我做饭");
    }
    public void show(){
        System.out.println("我女朋友叫"+getName()+"，身高"+getHigh()+"厘米,体重"+getWeight()+"斤");
    }
}
