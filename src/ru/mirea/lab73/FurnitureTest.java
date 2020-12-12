package ru.mirea.lab73;

public class FurnitureTest {
    public static void main(String[] args) {
        Sofa s = new Sofa(300);
        s.makePrice();
        s.repair();
        s.clean();
        s.buy();
    }
}
