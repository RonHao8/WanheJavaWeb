package com.wanhe.homeworkday07;

public class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public Manager() {
    }

    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public  void  work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
    public  void show(){
        System.out.print("工号为"+getId()+"基本工资为"+getSalary()+"奖金为"+getBonus()+"的项目经理");
    }
}
