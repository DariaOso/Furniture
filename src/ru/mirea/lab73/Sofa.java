package ru.mirea.lab73;

public class Sofa extends Furniture implements FurnitureShop {
    public Sofa(int quality) {
        super(quality);
    }
    public void clean(){

 System.out.println("Предмет почищен c помощью средств для чистки ткани");
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
