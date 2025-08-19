package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        A a = new B();

        B b = new B();

    }
}

class A {

    public void publicMethod() {
        System.out.println("publicMethod");
    }
}

class B extends A {

    @Override
    public void publicMethod() {
        super.publicMethod();
    }
}
