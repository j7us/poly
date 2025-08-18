package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        A a = new B();

        B b = new B();

        Class<? extends B> aClass = b.getClass();

        System.out.println(aClass.isAssignableFrom(a.getClass()));
    }
}

class A {}

class B extends A {}

class Attr <T extends A>{

    public void t(List<A> list) {
        System.out.println(list);
    }
}

class Test extends Attr<B> {

    @Override
    public String toString() {
        return "Test";
    }
}