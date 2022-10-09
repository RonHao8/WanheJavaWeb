package com.itwanho.sys.info.manager.factory;

import com.itwanho.sys.info.manager.dao.OtherStudentDao;
import com.itwanho.sys.info.manager.dao.StudentDao;

public class StudentDaoFactory {
    //需要数组库管类
    public static StudentDao getStudentDao(){
        return new StudentDao();
    }

//    public static OtherStudentDao getStudentDao(){
//        return new OtherStudentDao();
//    }
}
