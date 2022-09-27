package com.wanhe.homeworkday07;



public class Phone {
    private String brand;
    private int price;
    private String color;

    public Phone(String brand,int price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public Phone(){

    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void call(){
        System.out.println("打电话....");
    }
    public void sendMessage(){
        System.out.println("发短信....");
    }
    public void show(){
        System.out.print("正在使用价格为"+getPrice()+"元"+getColor()+"的"+getBrand());
    }
}
