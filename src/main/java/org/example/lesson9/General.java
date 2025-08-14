package org.example.lesson9;

public abstract class General {

    @Override
    public String toString() {
        return super.toString();
    }

    public General deserialize(String s){
        return new General() {};
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void copy(General other) {
        return;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Class<?> getType(){
        return this.getClass();
    }

    public boolean instanceOf(Class<?> type){
        return type.isAssignableFrom(this.getClass());
    }
}

class Any extends General {}
