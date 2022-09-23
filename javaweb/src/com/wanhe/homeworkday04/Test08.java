package com.wanhe.homeworkday04;

public class Test08 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,7,1,4,9,100,88,79};
        int[] arr2 = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 1){
                arr2[left] = arr[i];
                left++;
            }else {
                arr2[right] = arr[i];
                right--;
            }
        }

        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}
