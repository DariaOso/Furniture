package ru.mirea.lab73;

public class Furniture {
    int price;
    int quality;
    int money = 10000;


    void clean() {
        System.out.println("Предмет почищен");
    }

    void repair() {
        if (quality <= 50) {
            System.out.println("Предмет починен");
            money = money - 10 * quality;
        } else {
            System.out.println("У предмета нет поломок");
        }
    }


}