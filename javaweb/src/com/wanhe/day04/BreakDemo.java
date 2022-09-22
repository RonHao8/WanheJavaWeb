package com.wanhe.day04;

/*
跳转控制语句：
    break:中断
        使用场景：
            A.switch语句中
            B.循环中使用（结合if判断使用）
         break离开上面两个场景，无意义
         如何使用：
            A.跳出单层循环
            B.跳出多层循环
    continue:继续
 */

public class BreakDemo {
    public static void main(String[] args) {
        //跳出单层循环
        //场景：假如你有老婆了，然后犯错了，你老婆罚你做5天家务，每天都是洗碗
        //但是洗碗洗到第三天心软了，原谅你了不用再洗了
        for (int i = 1; i <= 5; i++){
            System.out.println("快乐的洗碗");
            if (i == 3){
                break;//单层循环
            }

        }

        //场景：假如你有老婆了，然后犯错了，你老婆罚你说3天，每天说5句我爱你，
        // 但是说到第2天第3句时候心软了，以后不用说了
        OUT:for (int i = 1; i <= 3; i++){//控制的天数
            for (int j = 1; j <= 5; j++){//每天5句
                System.out.println("我爱你");
                if (i == 2 && j == 3){
                    break OUT;//跳出外部指定的循环
                }
            }
        }
    }
}
