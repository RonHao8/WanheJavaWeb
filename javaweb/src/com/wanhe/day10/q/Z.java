package com.wanhe.day10.q;


class X {
    Y b = new Y();

    X() {
        System.out.print("X");
    }
}

class Y {
    Y() {
        System.out.print("Y");
    }
}


public class  Z extends X{
    Y y = new Y();

    Z() {
        // super( );
        System.out.print("Z");
    }

    public static void main(String[] args) {
        new Z();

    }
}
