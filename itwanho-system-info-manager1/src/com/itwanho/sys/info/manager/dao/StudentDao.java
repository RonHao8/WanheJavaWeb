package com.itwanho.sys.info.manager.dao;

import com.itwanho.sys.info.manager.domain.Student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDao {
    Scanner sc = new Scanner(System.in);
    //创建学生对象数组
    private static Student[] stus = new Student[5];

    public boolean addStudent(Student stu) {
        //添加学生对象到数组中
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student == null) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            //装满了
            return false;
        } else {
            //没有装满，正常添加，返回true
            stus[index] = stu;
            System.out.println(Arrays.toString(stus));
            return true;
        }

    }

    //查看所有学生信息的方法
    public Student[] findAllStudent() {
        return stus;
    }


    //删除,根据id删除学生信息
    public boolean deleteStudent(Student stu) {
        //int index = getIndex(id);
        //将索引位置使用null元素进行覆盖
        //stus[index] = null;
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null) {
                Student student = stus[i];
                if (student.getId().equals(stu.getId()) && student.getName().equals(stu.getName())) {//数据库中存在该学生
                    stus[i] = null;
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            System.out.println("id或者name输入有误,删除失败");
        }
        return flag;
    }

    //根据学生的id,查询该学生对象在数组中的索引的位置
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = StudentDao.stus[i];
            if (stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }


    //查看
    public boolean queryStudent(Student stu) {
        boolean flag = false;

//        if (stus == null){
//            System.out.println("查无信息，请添加信息后再查询");
//            return;
//        }

        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null) {
                if (student.getId().equals(stu.getId()) && student.getName().equals(stu.getName())) {//数据库中存在该学生
                    System.out.println("id\tname\tage\tbirthday");
                    System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getBirthday());
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            System.out.println("id或者name输入有误");
        }
        return flag;

    }

    //修改
    public boolean updateStudent(Student stu) {
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null) {
                if (student.getId().equals(stu.getId()) && student.getName().equals(stu.getName())) {//数据库中存在该学生
                    System.out.println("请输入要修改的选项:");
                    System.out.println("1:姓名\t2:年龄\t3；生日");
                    int num = sc.nextInt();
                    OUT:while (true){
                        switch (num){
                            case 1:
                                System.out.println("请输入修改的姓名");
                                student.setName(sc.next());
                                flag = true;
                                break OUT;
                            case 2:
                                System.out.println("请输入修改的年龄");
                                student.setAge(sc.next());
                                flag = true;
                                break OUT;
                            case 3:
                                System.out.println("请输入修改的生日");
                                student.setBirthday(sc.next());
                                flag = true;
                                break OUT;
                            default:
                                System.out.println("输入有误");
                                break OUT;
                        }
                    }
                    System.out.println("修改后的信息如下：");
                    queryStudent(student);
                }
            }
        }
        if (!flag) {
            System.out.println("信息修改失败");
        }
        return flag;
    }


}
