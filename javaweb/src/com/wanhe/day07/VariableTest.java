package com.wanhe.day07;

class Variable{
    int num;//0

    public void show(){
        int num = 10;
        System.out.println(num);
    }
}

public class VariableTest {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.show();
    }
}
