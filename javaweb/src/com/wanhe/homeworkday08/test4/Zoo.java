package com.wanhe.homeworkday08.test4;

public abstract class Zoo extends Foot{
    private String breed;
    private double price;

    public Zoo() {
    }

    public Zoo(String breed, double pride) {
        this.breed = breed;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void eat() {
        System.out.println("可以吃");
    }
}
