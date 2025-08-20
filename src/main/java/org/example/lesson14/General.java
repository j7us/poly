package org.example.lesson14;

import java.lang.reflect.Array;

public class General {}

abstract class AdditionPossibility <T> extends General {

    abstract T sum(T argument);
}

class Vector <T extends AdditionPossibility<T>> extends AdditionPossibility<Vector<T>> {
    T[] elements;
    int size;

    public Vector(T[] elements) {
        this.elements = elements;
        this.size = elements.length;
    }

    public Vector<T> sum(Vector<T> argument) {
        return argument.size != size ? null : sumElements(argument);
    }

    private Vector<T> sumElements(Vector<T> argument) {
        T[] newElements = (T[]) Array.newInstance(elements.getClass(), argument.size);
        T[] argumentElements = argument.elements;

        for (int i = 0; i < argument.size; i++) {
            newElements[i] = elements[i].sum(argumentElements[i]);
        }

        return new Vector<>(newElements);
    }
}
