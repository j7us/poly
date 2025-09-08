package org.example.lesson22;

public class Player {
    private Profession profession;
    private Race race;
}

abstract class Profession {}
abstract class Race {}


// При прочтении про наследование вида первым в голову пришла идея именно игрового персонажа, где игра,
// в зависимости от расы и профессии игрока, может генерировать как разные ситуации/катсцены, так и изменять отношение
// нпс к игроку.