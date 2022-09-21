package com.wanhe.homeworkday02;

public class Test09 {
    public static void main(String[] args) {
        int redTeaBefore = 21;
        int greenTeaBefore = 24;

        int redTeaNow = redTeaBefore * 2 + 3;
        int greenTeaNow = greenTeaBefore * 2;
        System.out.println("红茶妹妹现在的钱" + redTeaNow);
        System.out.println("绿茶妹妹现在的钱" + greenTeaNow);

        if (redTeaNow == greenTeaNow){
            System.out.println("两个人的钱一样多");
        }else if (redTeaNow > greenTeaNow){
            System.out.println("红茶妹妹现在的钱比绿茶妹妹的钱多");
        }else {
            System.out.println("红茶妹妹现在的钱比绿茶妹妹的钱少");
        }

    }
}
