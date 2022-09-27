package com.wanhe.homeworkday07;

public class Test3 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setBonus(6000);
        m.setId(123);
        m.setName("赵四");
        m.setSalary(15000);
        m.show();
        m.work();

        Coder c = new Coder();
        c.setId(135);
        c.setName("王五");
        c.setSalary(10000);

        c.show();
        c.work();
    }
}
