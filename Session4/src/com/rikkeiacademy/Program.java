package com.rikkeiacademy;

public class Program {
    public static void main(String[] args) {
        Store store = new Store();

        Product p1 = new Product("P01", "A phẩm 1", 1000, 10);
        Product p2 = new Product("P02", "C phẩm 2", 1000, 10);
        Product p3 = new Product("P03", "D phẩm 3", 1000, 10);
        Product p4 = new Product("P04", "B phẩm 4", 1000, 10);
        Product p5 = new Product("P05", "F phẩm 5", 1000, 10);

        Product p6 = new Product("P06", "H phẩm 6", 1000, 10);
        Product p7 = new Product("P07", "W phẩm 7", 1000, 10);
        Product p8 = new Product("P08", "E phẩm 8", 1000, 10);
        Product p9 = new Product("P09", "R phẩm 9", 1000, 10);
        Product p10 = new Product("P10", "Z phẩm 10", 1000, 10);
        Product p11 = new Product("P11", "O phẩm 11", 1000, 10);

        store.add(p1);
        store.add(p2);
        store.add(p3);
        store.add(p4);
        store.add(p5);
        store.add(p6);
        store.add(p7);
        store.add(p8);
        store.add(p9);
        store.add(p10);
        store.add(p11);

        store.show();

        store.sort();
        store.show();
    }
}
