package org.example.lesson12;

public abstract class General {

    public <E, T> void assignmentAttempt(E target, T source) {
        E result = null; //Нет аналогов Void

        try {
            result = (E) source;
        } catch (ClassCastException e) {}

        target = result;
    }
}

class Any extends General {}
