package com.example14.defaultstaticmethod;

public class DefaultStaticMethodTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("-------default method --------");
        getDefaultMethod();
        System.out.println("-------static method in interface --------");
        getStaticMethod();
    }

    private static void getDefaultMethod() {
        Playable student = new Undergraduate();
        student.playGame("God of War IV");
        Undergraduate undergraduate = new Undergraduate();
        undergraduate.playGame("The Last of Us II");
    }

    private static void getStaticMethod() {
        System.out.println(Learnable.getLeftTime(12));
    }
}
