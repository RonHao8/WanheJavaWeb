package com.wanhe.day06;

/*
方法参数传递基本类型：
    基本数据类型的参数，形式参数的改变，不影响实际参数
    每个方法在栈内存中，都会有独立的栈空间，方法运行结束就会弹出栈消失

方法参数传递引用类型
    引用类型的参数，形式参数的改变，会影响实际参数
    引用数据类型的传参，传入的是地址值，内存中会生成两个引用指向同一个内存的效果，
    所以即使方法弹栈，堆内存中的数据也已经是改变后的效果
 */
public class Test1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前"+number) ;//100
        change(number);
        System.out.println("调用change方法后"+number) ;//100

        System.out.println("======================");
        int[] arr = {10,20,30};
        System.out.println("调用change方法前:"+ arr[1]);//20
        change(arr);
        System.out.println("调用change方法后:"+ arr[1]);//200
    }

    public static void change(int number){
        number = 200;
    }

    public static void change(int[] arr){
        arr[1] = 200;
    }
}
