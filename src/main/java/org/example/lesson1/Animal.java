package org.example.lesson1;

// Ниже представлен пример наследования. Класс панд наследуется от травоядных, а те в свою очередь
// наследуются от класса животных.
public abstract class Animal {
    public void eat() {}
}

class Herbivores extends Animal {

    @Override
    public void eat() {
        System.out.println("Животное ест растения");
    }
}

class Panda extends  Herbivores {

    @Override
    public void eat() {
        System.out.println("Панда ест бамбук");
    }
}

// Здесь представлена композиция. Вольер содержит какое-то животное
class Cage {
    private Animal animal;

    public Cage(Animal animal) {
        this.animal = animal;
    }
}

// Полиморфизм в методе feedAnimal, который принимает базовый класс Animal
class Caretaker {
    public void feedAnimal(Animal animal) {
      animal.eat();
    }
}


