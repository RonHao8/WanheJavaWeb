package com.itwanho.sys.info.manager.dao;

import com.itwanho.sys.info.manager.domain.Student;

/*
接口：当一个类小红所有的方法都是抽象方法的时候，我们可以将其定义为接口，接口也是一种引用类型
 */
public interface BaseStudentDao {
    public abstract boolean addStudent(Student stu);

    //查看所有学生信息的方法
    public abstract Student[] findAllStudent();

    //根据id删除学生信息
    public abstract void deleteStudentById(String delId);

    //根据学生的id，查询该学生对象在数组中的索引的位置
    public abstract int getIndex(String id);

    public abstract void updateStudent(String updateId, Student newStu);

}
