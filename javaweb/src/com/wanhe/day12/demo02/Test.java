package com.wanhe.day12.demo02;

/*
教练与运动员案例实现：
    乒乓球运动员和篮球运动员
    乒乓球教练和篮球教练
    为了出国交流，跟乒乓球相关的人员都需要学习英语
   分析：当前案例中有哪些抽象类，哪些接口，哪些具体类
 */
public class Test {
    public static void main(String[] args) {
        PingPangPlaver ppp = new PingPangPlaver();
        ppp.setName("王浩");
        ppp.setAge(33);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.sleep();
        ppp.study();
        ppp.speak();

        //通过构造方法初始化实参
    }
}
