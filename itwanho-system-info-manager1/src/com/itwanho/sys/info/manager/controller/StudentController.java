package com.itwanho.sys.info.manager.controller;

import com.itwanho.sys.info.manager.domain.Student;
import com.itwanho.sys.info.manager.service.StudentService;

import java.util.Scanner;

//接收学生管理系统相关处理请求
public class StudentController {
    Scanner sc = new Scanner(System.in);
    private StudentService studentService = new StudentService();
    //开启学生管理系统，并展示学生管理系统菜单
    public void start(){
        studentLoop:while (true){
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");

            String choice = sc.next();
            switch (choice){
                case "1":
                    System.out.println("添加");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除");
                    deleteStudent();
                    break;
                case "3":
                    System.out.println("修改");
                    updateStudent();
                    break;
                case "4":
                    System.out.println("查看");
                    queryStudent();
                    break;
                case "5":
                    System.out.println("感谢使用学生管理系统！");
                    break studentLoop;
                default:
                    System.out.println("您输入的有误，请重新输入");
                    break;
            }
        }
    }

    //添加学生
    public void addStudent(){
        //键盘接收学生信息
        String id = inputStudentId();

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        System.out.println("请输入学生的年龄");
        String age = sc.next();
        System.out.println("请输入学生的生日");
        String birthday = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);

        //将学生对象传递给业务员Service，让业务员完成学生信息存储的操作
        //StudentService studentService = new StudentService();
        boolean result = studentService.addStudent(stu);
        if (result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }

    //删除学生
    public void deleteStudent(){
        //键盘接收学生信息
        String id = inputStudentId();

        System.out.println("请输入学生的姓名");
        String name = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);

        //将学生对象传递给业务员Service，让业务员完成学生信息存储的操作

        boolean result = studentService.deleteStudent(stu);
        if (result){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    //查看
    public void queryStudent(){
        //
        //键盘接收学生信息
        System.out.println("请输入学生的id:");
        String id = sc.next();
        System.out.println("请输入学生的姓名");
        String name = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);

        //将学生对象传递给业务员Service，让业务员完成学生信息存储的操作
        //StudentService studentService = new StudentService();
        boolean result = studentService.queryStudent(stu);
        if (result){
            System.out.println("查看成功");
        }else {
            System.out.println("查看失败");
        }
    }

    //修改
    public void updateStudent(){
        String id = inputStudentId();

        System.out.println("请输入学生的姓名");
        String name = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);

        //将学生对象传递给业务员Service，让业务员完成学生信息存储的操作
        //StudentService studentService = new StudentService();
        boolean result = studentService.updateStudent(stu);
        if (result){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    public String inputStudentId(){
        String id;
        while (true){
            System.out.println("请输入学生的id:");
            id = sc.next();
            boolean exists = studentService.isExists(id);
            if (!exists){
                System.out.println("您输入的id不存在，请重新输入");
            }else {
                break;
            }
        }
        return id;
    }
}
