package com.example03.variable;

public class VariableTest {
    public static void main(String[] args) {
        // 整数类型
        getIntegerLiterals();
        System.out.println("------------");
        // 浮点类型
        getFloatLiterals();
        System.out.println("------------");
        // 支持下划线分隔
        getUnderscoreNumericLiterals();
        System.out.println("------------");
        getCharacterandStringLiterals();
        System.out.println("------------");
        getConstants();
    }

    /**
     * int整数类型，基本字面量
     */
    private static void getIntegerLiterals() {
        // 长整型
        long creditCardNumber = 1234567890123456L;
        System.out.println(creditCardNumber);
    }
    /**
     * float浮点类型，基本字面量
     */
    private static void getFloatLiterals() {
        double d1 = 123.4;
        // 基于科学计数法
        double d2 = 1.234e2D;
        float f1 = 123.4F;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(f1);
    }
    /**
     * 使用下划线分隔符的字面量
     */
    private static void getUnderscoreNumericLiterals() {
        long creditCardNumber = 1234_5678_9012_3456L;
        int ubNumber = 2014_2_1_4159;
        float pi = 3.14_15F;
        System.out.println(creditCardNumber);
        System.out.println(ubNumber);
        System.out.println(pi);
    }
    /**
     * 声明字符/字符串字面量，转义符
     */
    private static void getCharacterandStringLiterals() {
        char ch = '\u0058';
        char ch2 = 'X';
        System.out.println(ch);
        System.out.println(ch2);
        String s = "this is a string";
        System.out.println(s);
        String s2 = "\"It's freezing in here\", he said coldly.";
        System.out.println(s2);
        String s3 = "src\\com\\example";
        System.out.println(s3);
    }
    /**
     * 声明常量
     */
    private static void getConstants() {
        final int NUM_GEARS = 6;
        System.out.println(NUM_GEARS);
        final String PROPERTY_FILE;
    }
}
