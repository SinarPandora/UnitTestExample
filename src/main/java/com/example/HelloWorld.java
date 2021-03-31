package com.example;

public class HelloWorld {
    public String method1() {
        return "HELLO WORLD";
    }

    public static String method2() {
        return "HELLO WORLD";
    }
    
    public String method3() {
        return method2() + "!";
    }
}
