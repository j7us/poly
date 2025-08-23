package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();

        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
        parent.test(list);
    }
}

class Parent {

    public <T> T test(List<T> param) {
        return param.getFirst();
    }
}

class Child extends Parent {

    @Override
    public <T> T test(List<T> param) {
        return param.get(2);
    }
}
