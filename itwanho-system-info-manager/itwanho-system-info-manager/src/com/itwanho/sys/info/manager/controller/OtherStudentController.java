package com.itwanho.sys.info.manager.controller;


import com.itwanho.sys.info.manager.domain.Student;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{
    private Scanner sc = new Scanner(System.in);
    @Override
    public Student inputStudentInfo(String id) {
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生的年龄:");
        String age = sc.next();
        System.out.println("请输入学生的生日:");
        String birthday = sc.next();

        Student stu = new Student(id,name,age,birthday);
        return stu;
    }
}
