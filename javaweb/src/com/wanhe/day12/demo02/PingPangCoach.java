package com.wanhe.day12.demo02;

public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃肉喝粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
