package com.itwanho.sys.info.manager.controller;

import com.itwanho.sys.info.manager.domain.Student;
import com.itwanho.sys.info.manager.service.StudentService;

import java.util.Scanner;

//接收学生管理系统相关处理请求
public class StudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    //开启学生管理系统，并展示学生管理系统菜单
    public void start(){
        studentLoop:while (true){
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("添加");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("修改");
                    updateStduent();
                    break;
                case "4":
                    //System.out.println("查看");
                    findAllStudents();
                    break;
                case "5":
                    System.out.println("感谢使用学生管理系统！");
                    //System.exit(0);
                    break studentLoop;
                default:
                    System.out.println("您输入的有误，请重新输入");
                    break;
            }
        }
    }

    //修改学生信息方法
    public void updateStduent() {
//        String updateId;
//        while (true){
//            System.out.println("请输入要修改的学生的id:");
//            //Scanner sc = new Scanner(System.in);
//            updateId = sc.next();
//            boolean exists = studentService.isExists(updateId);
//            if (!exists){
//                System.out.println("您输入的id不存在，重新输入！");
//            }else {
//                break;
//            }
//        }
        String updateId = inputStudentId();
//        System.out.println("请输入学生的姓名：");
//        String name = sc.next();
//        System.out.println("请输入学生的年龄：");
//        String age = sc.next();
//        System.out.println("请输入学生的生日：");
//        String birthday = sc.next();
//
//        Student newStu = new Student();
//        newStu.setId(updateId);
//        newStu.setName(name);
//        newStu.setAge(age);
//        newStu.setBirthday(birthday);
        Student newStu = inputStudentInfo(updateId);

        studentService.updateStduent(updateId,newStu);
        System.out.println("修改完成");

    }

    //删除学生信息方法
    public void deleteStudentById() {
//        String delId;
//        while (true){
//            System.out.println("请输入要删除的学生的id:");
//            //Scanner sc = new Scanner(System.in);
//            delId = sc.next();
//            boolean exists = studentService.isExists(delId);
//            if (!exists){
//                System.out.println("您输入的id不存在，重新输入！");
//            }else {
//                break;
//            }
//        }
        String delId = inputStudentId2();
        //调用业务员根据id删除学生信息
        studentService.deleteStudentById(delId);

        System.out.println("删除成功！");
    }

    //查看学生信息方法
    public void findAllStudents() {
        //业务层
        Student[] stus = studentService.findAllStudents();//null

        if (stus == null){
            System.out.println("查无信息，请先添加学生信息后重试");
            return;
        }

        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null){
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" +
                        stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }

    }

    //添加学生
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        //键盘接收学生信息
        String id;
        while(true){
            System.out.println("请输入学生的id:");
            id = sc.next();
            //判断id是否存在-->业务处理Service
            boolean flag = studentService.isExists(id);
            if (flag){
                System.out.println("学号已经被占用，请重新输入");
            }else {
                break;
            }
        }
//        System.out.println("请输入学生的姓名:");
//        String name = sc.next();
//        System.out.println("请输入学生的年龄:");
//        String age = sc.next();
//        System.out.println("请输入学生的生日:");
//        String birthday = sc.next();
//
//        Student stu = new Student();
//        stu.setId(id);
//        stu.setName(name);
//        stu.setAge(age);
//        stu.setBirthday(birthday);
        Student stu = inputStudentInfo(id);

        //将学生对象传递给业务员Service，让业务员完成学生信息存储的操作
        //StudentService studentService = new StudentService();
        boolean result = studentService.addStuedent(stu);
        if (result) {
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
    //键盘录入学生信息
    public Student inputStudentInfo(String id){
        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        System.out.println("请输入学生的年龄:");
        String age = sc.next();
        System.out.println("请输入学生的生日:");
        String birthday = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);

        return stu;
    }

    public String inputStudentId(){
        String id;
        while(true){
            System.out.println("请输入学生的id:");
            id = sc.next();
            //判断id是否存在-->业务处理Service
            boolean flag = studentService.isExists(id);
            if (flag){
                System.out.println("学号已经被占用，请重新输入");
            }else {
                break;
            }
        }
        return id;
    }

    public String inputStudentId2(){
        String id;
        while(true){
            System.out.println("请输入学生的id:");
            id = sc.next();
            //判断id是否存在-->业务处理Service
            boolean flag = studentService.isExists(id);
            if (flag){
                System.out.println("该学号存在");
                break;
            }else {
                System.out.println("该学号不存在");
            }
        }
        return id;
    }
}
