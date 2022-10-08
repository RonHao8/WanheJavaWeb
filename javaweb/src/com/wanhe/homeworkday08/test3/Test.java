package com.wanhe.homeworkday08.test3;

public class Test {
    public static void main(String[] args) {
        Clerk clerk = new Clerk("李小亮","C001","销售部");
        clerk.showMsq();
        Manager manager = new Manager("张小强","M001","销售部",
                clerk);
        manager.showMsq();
        System.out.println("经理的职员为:"+clerk.getName()+"职员的经理是"+manager.getName());

    }
}

abstract  class Employee
{
    private String name;
    private String workId;
    private String dept;

    public Employee() {
    }

    public Employee(String name, String workId, String dept) {
        this.name = name;
        this.workId = workId;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public abstract void showMsq();
}

class Manager extends Employee{
    Clerk clerk;

    public Manager(String name, String workId, String dept, Clerk clerk) {
        super(name, workId, dept);
        this.clerk = clerk;
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void showMsq() {
        System.out.println("经理：工号为 "+this.getWorkId()+
                "名字为 "+this.getName()+"部门为"+this.getDept());
    }
}
class Clerk extends Employee{
    Manager manager;
    @Override
    public void showMsq()
    {
        System.out.println("职员：工号为 "+this.getWorkId()+
                "名字为 "+this.getName()+"部门为"+this.getDept());
    }
    public Clerk()
    {

    }


    public Clerk(String name, String workId, String dept) {
        super(name, workId, dept);

    } public Clerk(String name, String workId, String dept, Manager manager) {
        super(name, workId, dept);
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
