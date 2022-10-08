package com.wanhe.homeworkday08.test4;

public abstract class Botany extends Foot{
    private String colour;

    public Botany() {
    }

    public Botany(double weight, String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract void use();

    @Override
    public void eat() {
        System.out.println("可以吃");
    }
}
