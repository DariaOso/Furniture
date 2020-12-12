package ru.mirea.lab73;

public abstract class Furniture {
    int quality;
    static int money = 1000;
    Furniture(int quality){
        this.quality=quality;
    }


    void repair() {
        System.out.println("Предмет починен");
    }

    public abstract void clean();


}
