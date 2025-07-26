package org.example.lesson2;

// Пример для пункта специализация класса-родителя.
// В данном случае у нас есть класс дверь и его более специализированный случай дверь с замком,
// который уточняет методы.
public class Door {

    public void open() {
        System.out.println("Дверь открылась");
    }

    public void close() {
        System.out.println("Дверь закрылась");
    }
}

class SecurityDoor extends Door {

    @Override
    public void open() {
        System.out.println("Открылся замок, Дверь открылась");
    }

    @Override
    public void close() {
        System.out.println("Дверь закрылась, замок закрылся");
    }
}

// Расширение класса-родителя
// В данном случае мы расширяем класс страницы с текстом, добавляя ему возможность также содержать
// картинку.
class PageWithText {
    private String text;

    public String getText() {
        return text;
    }
}

class PageWithTextAndImage extends PageWithText {
    private String image;

    public String getImage() {
        return image;
    }
}
