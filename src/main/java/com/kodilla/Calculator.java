package com.kodilla;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a=a;
        this.b=b;
    }

    public int add() {
        return a+b;
    }

    public int  sub(){
        return a-b;
    }
}


