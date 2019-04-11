package com.example25.initialorder;

public class A {
    public A() {
        System.out.println("A: constructor");
    }
    static {
        System.out.println("A: static block");
    }
    private static String S = create();
    private static String create() {
        System.out.println("A: static method create()");
        return "";
    }
    /*static {
        System.out.println("A: static block 2");
    }*/
    public static String getS() {
        System.out.println("A: static method getS()");
        return S;
    }
}
