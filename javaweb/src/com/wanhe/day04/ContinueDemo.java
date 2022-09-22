package com.wanhe.day04;

/*
continue:跳过某一次循环体内容的执行
使用场景：
    循环中，离开此应用场景无意义
 */

public class ContinueDemo {
    public static void main(String[] args) {
        //场景：假如你有老婆了，然后犯错了，你老婆罚你做5天家务，每天都是洗碗
        //但是洗碗洗到第三天心软了，原谅你了不用再洗了,但是依然不解恨，继续洗第4天，第5天
        for (int i = 1; i <= 5; i++){
            if (i == 3){
                continue;//跳出此次循环，进入下一次循环
            }
            System.out.println("洗碗第" + i + "天");
        }


        System.out.println("====================");
        //场景：假如你有老婆了，然后犯错了，你老婆罚你说3天，每天说5句我爱你，
        // 但是说到第2天第3句时候心软了，以后不用说了
        OUT:for (int i = 1; i <= 3; i++){//控制的天数
            for (int j = 1; j <= 5; j++){//每天5句
                System.out.println("我爱你");
                if (i == 2 && j == 3){
                    continue OUT;//跳出外部指定的循环
                }
            }
        }

        System.out.println("================");
        for(int x=1; x<=10; x++) {
            if(x%3==0) {
                //在此处填写代码
                //break;
                //continue;
                System.out.println("Java基础班");
            }
            System.out.println("Java基础班");
        }
    }
}
