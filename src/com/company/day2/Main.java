package com.company.day2;

class A {
    public void meth() {
        System.out.println("Invoked from parent class A");
    }
}

class B extends A {
    public void meth() {
        System.out.println("Overrident from base class B");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        B obj1 = new B();
        A obj2 = new A();
        obj1.meth();
        obj2.meth();
    }
}