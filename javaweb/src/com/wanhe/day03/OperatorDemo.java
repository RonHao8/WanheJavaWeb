package com.wanhe.day03;

/*
扩展算术运算符：
    ++：变量自身+1
    --：变量自身-1
    ++和--既可以放在变量的后面，也可以放在变量的前边
 使用：
        单独使用（一句代码中只做了++或者--，没有其他操作）：
            ++和--无论放在变量的前面或者后面，结果都是一样的
        参与操作：
            ++、--在前：先对该变量做++或者--，然后再拿变量参与操作
            ++、--在后：先对该变量原本的值取出来参与运算，运算后再++或者--6
*/
public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        a--;//单独使用
        System.out.println(a);

        int b = 10;
        //int c = b++;//10
        int c = ++b;//11
        System.out.println(b);//11  11
        System.out.println(c);//11  10

//        System.out.println(10--);//只能操作变量，不能操作常量
    }
}
