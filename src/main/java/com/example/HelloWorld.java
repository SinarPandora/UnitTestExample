package com.example;

public class HelloWorld {
    private WebServiceApi webServiceApi;

    public HelloWorld(WebServiceApi webServiceApi) {
        this.webServiceApi = webServiceApi;
    }

    public String method1() {
        return "HELLO WORLD";
    }

    public static String method2() {
        return "HELLO WORLD";
    }

    public String method3() {
        return method2() + "!";
    }

    public String method4(String url) {
        return webServiceApi.getDataFrom(url).get("data");
    }

    public final String method5() {
        return "HELLO WORLD";
    }

    public String method6() {
        return this.method5() + "!";
    }
}
