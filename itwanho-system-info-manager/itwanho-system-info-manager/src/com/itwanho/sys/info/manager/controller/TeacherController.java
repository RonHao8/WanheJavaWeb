package com.itwanho.sys.info.manager.controller;

import com.itwanho.sys.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private TeacherService teacherService = new TeacherService();
    private Scanner sc = new Scanner(System.in);
    //开启老师管理系统，并展示老师管理系统菜单

    public void start(){
        while (true){
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    addTeacher();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("您输入的有误，请重新输入");
                    break;

            }
        }
    }

    private void addTeacher() {
    }
}
