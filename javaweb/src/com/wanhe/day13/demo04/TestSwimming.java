package com.wanhe.day13.demo04;

/*
匿名内部类应用场景：
 */

//定义游泳接口
interface Swimming{
    void swim();
}

//class a implements Swimming{
//    @Override
//    public void swim() {
//
//    }
//}

public class TestSwimming {
    public static void main(String[] args) {
        //goSwimming(new a());
        goSwimming(new Swimming() {//该接口的具体的实现类对象，使用的是匿名内部类对象传递
            @Override
            public void swim() {
                System.out.println("老铁，咱们去游泳吧");
            }
        });
    }

    //使用接口的方法
    public static void goSwimming(Swimming swimming){
        swimming.swim();
    }
}
