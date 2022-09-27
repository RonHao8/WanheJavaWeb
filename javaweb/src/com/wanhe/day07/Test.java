package com.wanhe.day07;

import java.util.Objects;
import java.util.Scanner;

/*
需求：模拟购物车的功能
1.定义一个商品类：Article(属性：名称，价格)
2.定义一个数组容器存储商品对象，代表购物车对象

功能：
    添加商品
    查看商品
    修改数量
    结算价格
 */
public class Test {
    public static void main(String[] args) {
        //定义一个数组存储商品对象的，代表购物车
        //int[] arr = new int[10];//存储的是整数

        Article[] shopCar = new Article[10];//存储的是商品对象

        Scanner sc = new Scanner(System.in);

        OUT:while (true){
            System.out.println("*************************");
            System.out.println("添加商品：add");
            System.out.println("查看商品：query");
            System.out.println("修改商品：update");
            System.out.println("结算价格：pay");
            System.out.println("退出：exit");
            System.out.println("请选择要操作的功能：");
            System.out.println("*************************");
            String command = sc.next();

            switch (command){
                case "add":
                    //添加功能
                    addArticle(shopCar);
                    System.out.println("添加功能");
                    break;
                case "query":
                    //查询功能
                   queryArticle(shopCar);
                    System.out.println("查询功能");
                    break;
                case "update":
                    //修改数量
                    updateBuyNumber(shopCar);
                    System.out.println("修改数量");
                    break;
                case "pay":
                    //结算价格
                    pay(shopCar);
                    System.out.println("结算价格");
                    break;
                case "exit":
                    break OUT;
                default:
                    System.out.println("当前目录输入有误！");
            }
        }
    }

    public static void addArticle(Article[] shopCar){
        //具体的商品
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品的名称: ");
        String name = sc.next();
        System.out.println("请输入商品的价格");
        double price = sc.nextDouble();
        System.out.println("请输入商品的数量");
        int buyNumber = sc.nextInt();
        //创建一个商品对象，添加到数组中去
        Article a = new Article();
        a.name = name;
        a.price = price;
        a.buyNumber = buyNumber;

        //遍历购物车数组对象，判断哪个位置是null，把商品对象添加进去
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null){
                shopCar[i] = a;
                break;
            }
        }
    }

    public static void queryArticle(Article[] shopCar){
        System.out.println("名称"+"\t"+"价格"+"\t"+"数量");
        for (int i = 0; i < shopCar.length; i++){
            if (shopCar[i] != null){//防止空指针异常
                System.out.println(shopCar[i].name+"\t"+shopCar[i].price+"\t"+shopCar[i].buyNumber);
            }else {
                return;
            }
        }
    }

    public static void updateBuyNumber(Article[] shopCar){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入要修改商品的名称");
            String name = sc.next();
            for (int i = 0; i < shopCar.length; i++){
                if (shopCar[i] != null){
                    if (shopCar[i].name.equals(name)){
                        System.out.print("购物车中存在该商品");
                        System.out.println("请输入修改后的数量");
                        int num = sc.nextInt();
                        shopCar[i].buyNumber = num;
                        System.out.println("修改成功,修改后的商品信息如下：");
                        System.out.println("名称"+"\t"+"价格"+"\t"+"数量");
                        System.out.println(shopCar[i].name+"\t"+shopCar[i].price+"\t"+shopCar[i].buyNumber);
                        return;
                    }
                }else {
                    System.out.println("购物车中不存在该商品，请重新输入");
                    break;
                }

            }

        }

    }
//    //根据商品名称查询数组中对应的商品对象
//    public static Article getArticleByName(String name,Article[] shopCar){
//        for (int i = 0; i < shopCar.length; i++){
//            Article a = shopCar[i];
//            if (a != null && a.name.equals(name)){
//                return a;
//            }
//        }
//        return null;
//    }

    public static void pay(Article[] shopCar){
        System.out.println("你的购物车商品清单如下");
        queryArticle(shopCar);
        double sum = 0;
        for (int i = 0; i < shopCar.length; i++){
            if (shopCar[i] != null){
                sum += shopCar[i].price * shopCar[i].buyNumber;
            }else {
                break;
            }
        }
        System.out.println("购物车总价格为:"+sum);
    }
}
