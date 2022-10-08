package com.wanhe.homeworkday08.test4;

public abstract class Foot {
    private double weight;

    public Foot() {
    }

    public Foot(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void eat();
}
