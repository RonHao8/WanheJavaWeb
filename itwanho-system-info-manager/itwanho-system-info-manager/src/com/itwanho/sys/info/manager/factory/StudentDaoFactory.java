package com.itwanho.sys.info.manager.factory;

import com.itwanho.sys.info.manager.dao.BaseStudentDao;
import com.itwanho.sys.info.manager.dao.OtherStudentDao;

public class StudentDaoFactory {
    //需要数组库管类
    public static BaseStudentDao getStudentDao(){//BaseStudentDao dao = new StudentDao;
        //return new StudentDao();
        return new OtherStudentDao();
    }

//    public static OtherStudentDao getStudentDao(){
//        return new OtherStudentDao();
//    }
}
