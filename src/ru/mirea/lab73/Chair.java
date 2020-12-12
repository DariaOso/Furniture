package ru.mirea.lab73;

public class Chair extends Furniture implements FurnitureShop {
    public Chair(int quality) {
        super(quality);
    }
    public void clean() {

        System.out.println("Предмет почищен с помощью средств для чистки ткани и дерева");
    }

    public void makePrice() {
        System.out.println("Предмет будет стоить : " + quality + " дублонов");
    }

    public void buy() {
        money = this.money;
        money = money - quality;
        System.out.println("Спасибо за покупку! У вас осталость: " + money + " дублонов");
    }
}
