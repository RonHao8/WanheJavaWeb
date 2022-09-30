package com.wanhe.day10.demo02;

public class Student extends Person{
    //子类特有的属性
    private int score;

    public Student(){
        super();
    }

    public Student(String name,int age,int score){
        super(name,age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }
}
