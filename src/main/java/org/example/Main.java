package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        B[] b = new B[10];

        b[2] = new B(5);

        Vector<B> bVector = new Vector<>(b);

        Vector<B>[] vv = new Vector[2];

        vv[0] = bVector;

        Vector<Vector<B>> vectorVector = new Vector<>(vv);

        B[] b2 = new B[10];

        b2[3] = new B(5);

        Vector<B> bVector2 = new Vector<>(b2);

        Vector<B>[] vv2 = new Vector[2];

        vv2[0] = bVector2;

        Vector<Vector<B>> vectorVector2 = new Vector<>(vv2);

        Vector<Vector<B>> sum = vectorVector.sum(vectorVector2);

        System.out.println(sum);
    }
}

class General {}

abstract class AdditionPossibility <T> extends General {

    abstract T sum(T argument);
}

class B extends AdditionPossibility<B> {
    private Integer el;

    public B(int el) {
        this.el = el;
    }

    @Override
    B sum(B argument) {
        int newEl = argument == null || argument.el == null ? el : el + argument.el;

        return new B(newEl);
    }
}

class Vector <T extends AdditionPossibility<T>> extends AdditionPossibility<Vector<T>> {
    private T[] elements;
    private int size;

    public Vector(T[] elements) {
        this.elements = elements;
        this.size = elements.length;
    }

    public Vector<T> sum(Vector<T> argument) {
        return argument.size != size ? null : sumElements(argument);
    }

    private Vector<T> sumElements(Vector<T> argument) {
        T[] newElements = (T[]) Array.newInstance(elements.getClass().getComponentType(), argument.size);
        T[] argumentElements = argument.elements;

        for (int i = 0; i < argument.size; i++) {
            newElements[i] = elements[i] == null ? argumentElements[i] : elements[i].sum(argumentElements[i]);
        }

        return new Vector<>(newElements);
    }
}
