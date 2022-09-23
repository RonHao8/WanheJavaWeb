package com.wanhe.homeworkday04;

import java.util.Random;

public class Test18 {
    public static void main(String args[]){

        int[] arr = new int[]{2,588,888,1000,10000};
        int[] brr = new int[arr.length];
        getRaffle(arr,brr);


    }

    public static void getRaffle(int[] arr, int[] brr){
        Random r = new Random();
        int index = 0;

        while(index<=5) {
            int i=r.nextInt(arr.length);
            if(brr[i]==arr[i]){
                continue;
            } else {
                brr[i]=arr[i];
                System.out.println(arr[i]+"元的奖金被抽出");
                index++;

            }
        }
    }


}
