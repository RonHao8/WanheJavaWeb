package com.wanhe.day04;

/*
格式：
switch (表达式) {
	case 1:
		语句体1;
		break;
	case 2:
		语句体2;
		break;
	...
	default:
		语句体n+1;
		break;
}

案例：
    本周的安排：
        周一：埋头苦干，解决bug
        周二：请求大牛程序员帮忙
        周三：今晚啤酒、龙虾、小烧烤
        周四：主动帮助新来的女程序员解决bug
        周五：今晚王者、吃鸡
        周六：与王婆介绍的小芳相亲
        周日：郁郁寡欢，准备上班

注意事项：
    case后面只能是常量，不能是变量，而且多个case后面的值是不能重复的
    default可以省略，但是不建议，default可以书写在任何位置
    case穿透（把break省略导致的）,不会进行任何case后面的值的匹配，
    而是直接执行下一个case中的语句体内容

    switch语句结束的条件：
        a.遇到break就结束了
        b.执行到末尾就结束了
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SwitchDemo {
    public static void main(String[] args) {
        String weekday = "周一";

        switch (weekday){
            case "周一":
                System.out.println("周一：埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("周二：请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("周三：今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("周四：主动帮助新来的女程序员解决bug");
                break;
            case "周五":
                System.out.println("周五：今晚王者、吃鸡");
                break;
            case "周六":
                System.out.println("周六：与王婆介绍的小芳相亲");
                break;
            case "周日":
                System.out.println("周日：郁郁寡欢，准备上班");
                break;
            default:
                System.out.println("输入的值有误");
                break;

        }


        int x = 2;
        int y = 3;
        switch(x){
            default:
                y++;
                break;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y="+y);
        System.out.println("---------------");

        int a = 2;
        int b = 3;
        switch(a){
            default:
                b++;
            case 3:
                b++;
            case 4:
                b++;
        }
        System.out.println("b="+b);
    }

}
