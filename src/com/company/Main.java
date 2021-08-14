package com.company;

// Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return,
// как возвращаемый результат метода createHeroes. Hero[]
// Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
public class Main {

    public static void main(String[] args) {
        // write your code here

        Boss boss = new Boss();
        boss.setBossDefence("Magical");
        boss.setDamage(50);
        boss.setHealth(700);
        System.out.println("Boss defence: " + boss.getBossDefence() + "," + "  health: " + boss.getHealth() + "," + "  damage: " + boss.getDamage());


        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Hero: " + createHeroes()[i].getPower() + "," +
                    "  health: " + createHeroes()[i].getHealth() + "," + "  damage: " + createHeroes()[i].getDamage());

        }
    }


    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(350, 25);
        Hero hero2 = new Hero(300, 20, "Kinetic");
        Hero hero3 = new Hero(400, 35, "Physical");
        Hero heroes[] = {hero1, hero2, hero3};
        return heroes;
    }
}
