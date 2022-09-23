package com.wanhe.homeworkday04;

public class Test07 {
    public static void main(String[] args) {
        double[] arr = new double[]{10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};
        int count1 = 0;
        int count2 = 0;

        for (int i =0; i < arr.length; i++){
            if (arr[i] > 0){
                count1++;
            }else if (arr[i] < 0){
                count2++;
            }
        }
        System.out.println("赚钱的股票一共有：" + count1 + "只");
        System.out.println("赔钱的股票一共有：" + count2 + "只");
    }
}
