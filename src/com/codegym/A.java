package com.codegym;

public class A{
    private int i = 40;

    public A() {
    }

    public A(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private void display(){
        System.out.println("Display");
    }

    public void getDisplay(){
        display();
    }
}
