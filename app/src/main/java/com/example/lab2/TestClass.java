package com.example.lab2;

import java.sql.SQLOutput;

public class TestClass {
    private int a = 0;
    private String b = "O";

    public TestClass(){}

    public TestClass(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void instance(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }
}
