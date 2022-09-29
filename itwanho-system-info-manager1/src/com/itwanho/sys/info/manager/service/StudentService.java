package com.itwanho.sys.info.manager.service;

import com.itwanho.sys.info.manager.dao.StudentDao;
import com.itwanho.sys.info.manager.domain.Student;

/*
业务员
 */
public class StudentService {
    //添加学生信息
    private StudentDao studentDao = new StudentDao();
    public boolean addStudent(Student stu){
        //存储学生信息-->库管
        boolean flag = studentDao.addStudent(stu);
        return flag;
    }

    //判断学员学号id是否存在
    public boolean isExists(String id){
        //判断id是否存在，先得获取数组中所有的数据
        Student[] stus = studentDao.findAllStudent();
        //假设id在数组中不存在
        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            //数组没有装满的话，里面就会有null,null直接调用会空指针异常
            if (student !=null && student.getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;

    }

    //删除学生信息
    public boolean deleteStudent(Student stu){
        //通知库管根据id删除学生信息
        boolean flag = studentDao.deleteStudent(stu);
        return flag;
    }


    //查看学生信息
    public boolean queryStudent(Student stu){
        //调用库管对象获取学生对象数组
        boolean flag = studentDao.queryStudent(stu);
        return flag;
    }

    //修改学生信息
    public boolean updateStudent(Student stu){
        //存储学生信息-->库管
        //StudentDao studentDao = new StudentDao();
        boolean flag = studentDao.updateStudent(stu);
        return flag;
    }
}
