package com.itwanho.sys.info.manager.service;

import com.itwanho.sys.info.manager.dao.OtherStudentDao;
import com.itwanho.sys.info.manager.dao.StudentDao;
import com.itwanho.sys.info.manager.domain.Student;
import com.itwanho.sys.info.manager.factory.StudentDaoFactory;

/**
 * 业务员
 */
public class StudentService {
    //private StudentDao studentDao = new StudentDao();
    //集合版本的持久层
    //private OtherStudentDao studentDao = new OtherStudentDao();

    //通过学生库管工厂类，获取库管对象
    //private OtherStudentDao studentDao = StudentDaoFactory.getStudentDao();
    private StudentDao studentDao = StudentDaoFactory.getStudentDao();


    //添加学生信息
    public boolean addStuedent(Student stu){
        //存储学生信息-->库管
        //StudentDao studentDao = new StudentDao();
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
            //数组没有装满的话，里面就会有null，null直接调用方法会空指针异常
            if(student != null && student.getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;
    }

    //查看学生信息方法
    public Student[] findAllStudents() {
        //调用库管对象获取学生对象数组
        Student[] allStudent = studentDao.findAllStudent();
        //思路：数组中只要存在一个值不是null的元素，那就代表有学生信息
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if (stu != null){
                flag = true;
                break;
            }
        }
        if (flag) {
            //有信息,返回数组
            return allStudent;
        }else {
            //没有信息，返回null
            return null;
        }
    }

    public void deleteStudentById(String delId) {
        //通知库管根据id删除学生信息
        studentDao.deleteStudentById(delId);
    }

    public void updateStduent(String updateId, Student newStu) {
        studentDao.updateStudent(updateId,newStu);
    }
}
