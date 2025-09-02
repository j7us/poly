package org.example.lesson20;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

// Наследования вариаций
public class ParentType {

    public void someMethod(String a) {
        System.out.println(a);
    }
}

// Наследование с функциональной вариацией
class FunctionalChildType extends ParentType {

    @Override
    public void someMethod(String a) {
        System.out.println("child" + a);
    }
}

// Наследование с вариацией типа
class TypeVarChildType extends ParentType {

    public void someMethod(Integer a) {
        System.out.println("child" + a);
    }
}


// Наследование с конкретизацией
abstract class AbstractParentType {
    abstract void someMethod(String a);
}

class ConcreteParentType extends AbstractParentType {

    @Override
    void someMethod(String a) {
        System.out.println("concrete" + a);
    }
}


// Структурное наследование
class SomeNewList<T> implements Iterable<T> {

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
