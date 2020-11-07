package ru.mirea.lab73;

public class FurnitureShop extends Furniture {

    void makePrice(int quality) {
        this.quality = quality;
        price = quality * 100;
        System.out.println("Предмет будет стоить : " + price + " дублонов");
    }

    void buy() {
        money = money - price;
        System.out.println("Спасибо за покупку! У вас осталость: " + money + " дублонов");
    }
}

