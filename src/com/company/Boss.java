package com.company;
//Создать класс Босса (Boss),
// с приватными полями здоровье, урон и тип защиты.
// Добавить в класс геттеры и сеттеры для всех полей.
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
// Затем распечатать всю информацию о боссе.
public class Boss {
    private int health;
    private int damage;
    private String bossDefence;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }
}
