package com.itwanho.sys.info.manager.dao;

import com.itwanho.sys.info.manager.domain.Student;

public class StudentDao {
    private static Student[] stus = new Student[5];
    public boolean addStudent(Student stu){
        //创建学生对象数组
        //Student[] stus = new Student[5];
        //添加学生对象到数组中
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student == null){
                index = i;
                break;
            }
        }
        if(index == -1){
            //装满了
            return false;
        }else {
            //没有装满，正常添加，返回true
            stus[index] = stu;
            //System.out.println(Arrays.toString(stus));
            return true;
        }
    }

    //查看所有学生信息的方法
    public Student[] findAllStudent(){
        return stus;
    }

    //根据id删除学生信息
    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        //将索引位置使用null元素进行覆盖
        stus[index] = null;
    }

    //根据学生的id，查询该学生对象在数组中的索引的位置
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = StudentDao.stus[i];
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String updateId, Student newStu) {
        int index = getIndex(updateId);
        stus[index] = newStu;
    }
}
