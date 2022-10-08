package com.itwanho.sys.info.manager.dao;

import com.itwanho.sys.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao {
    //数组
    //private static Student[] stus = new Student[5];

    //集合容器
    private static ArrayList<Student> stus = new ArrayList<>();


    //静态代码块，类加载是自动执行，只执行一次
    static {
        Student stu1 = new Student("wanho001","张三","23","1998-10-10");
        Student stu2 = new Student("wanho002","李四","25","2000-10-10");
        stus.add(stu1);
        stus.add(stu2);
    }

    public boolean addStudent(Student stu){
        stus.add(stu);
        return true;
    }

    //查看所有学生信息的方法
    public Student[] findAllStudent(){
        Student[] students = new Student[stus.size()];
        for (int i = 0; i < students.length; i++) {
            students[i] = stus.get(i);
        }
        return students;
    }

    //根据id删除学生信息
    public void deleteStudentById(String delId) {
        int index = getIndex(delId);

        //将索引位置使用null元素进行覆盖
        stus.remove(index);
    }

    //根据学生的id，查询该学生对象在数组中的索引的位置
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String updateId, Student newStu) {
        int index = getIndex(updateId);
        //stus[index] = newStu;
        stus.set(index,newStu);
    }
}
