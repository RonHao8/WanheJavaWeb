package com.wanhe.day05;
/*
带参数的方法定义:
public static void 方法名（参数类型 变量）{
    方法体;
}

方法定义的时候，参数中的数据类型和变量名不能缺少
方法定义时，多个参数之间用逗号隔开
调用方法时，传入的值的数量和数据类型要对应

形式参数：形参,就是方法定义上的参数，用于 接受实际参数的
实际参数：实参，方法调用中传入的参数

打印n-m之间所有的奇数
100-300
200-500

print()

带返回值方法定义：
public static 数据类型 方法名（数据类型 变量名）{
    方法体;
    return 数据;
}
 */

public class MethodDemo2 {
    public static void main(String[] args) {//静态方法只能调用静态方法
        method(20);//实参
        print(200,300);
        int max = maxArr(new int[]{20,88,66});
        System.out.println("max:"+ max);
    }

    //声明一个方法，用来获取数组的最大值
    public static int maxArr(int[] arr){
        //假设数组中的第一个元素是最大值
        int max = arr[0];
        //遍历数组，获取每一个元素，准备进行比较
        for (int i = 1; i < arr.length; i++){//arr,for
            if (max < arr[i]) {
                //如果在比较的过程中，出现了比max更大的值，让max记录这个更大的值
                max = arr[i];
            }
        }
        //System.out.println("max:"+ max);
        return max;
    }

    //定义方法
    public static void method(int num){//形参
        //int num = 20;
        if (num % 2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
       return; //终止方法
    }

    public static void print(int n,int m){//100,200
        //打印某个范围的奇数
        for (int i = n; i <= m; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }


}
