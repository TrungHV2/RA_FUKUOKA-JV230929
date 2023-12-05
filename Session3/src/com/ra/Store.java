package com.ra;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        /**
         * Tạo lớp Product {
         *     private String id;
         *     private String name;
         *     private double price;
         *     private double discount; // phần trăm giảm giá
         *     private double salePrice;
         * }.
         */
        Scanner sc = new Scanner(System.in);
        // Khai báo mảng lưu trữ sp
        Product[] products = new Product[5];
        // Chạy vòng lặp nhập 5 sp
        for (int i = 0; i < 5; i++) {
            Product p = new Product();
            System.out.print("Mã sp: ");
            p.setId(sc.nextLine());
            System.out.print("Tên sp: ");
            p.setName(sc.nextLine());
            System.out.print("Giá sp: ");
            p.setPrice(Double.parseDouble(sc.nextLine()));
            System.out.print("Giảm giá(%): ");
            p.setDiscount(Double.parseDouble(sc.nextLine()));

            products[i] = p;
        }
        // Duyệt tính giá bán
        for (int i = 0; i < 5; i++) {
            products[i].setSalePrice(products[i].getPrice() - (products[i].getPrice() / 100 * products[i].getDiscount()));
        }
        // Sắp xếp
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (Double.compare(products[j].getSalePrice(), products[i].getSalePrice()) > 0) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
        // Hiển thị
        for (int i = 0; i < 5; i++) {
            System.out.println("Id: " + products[i].getId());
            System.out.println("SalePrice: " + products[i].getSalePrice());
            System.out.println("_____");
        }
        /** Viết chương trình java. Nhập vào danh sách 5 sản phẩm.
         * Hiển thị thông tin sản phẩm theo giá bán (salePrice=price - (price / 100 * discount))
         * giảm dần.
         *
         * Yêu cầu BTVN: dựa trên class Product đã tạo, trong Product bổ sung phương thức calculateSalePrice() để
         * tính giá bán cho sản phẩm (salePrice = price - (price / 100 * discount)).
         * Viết chương trình Java thực hiện các chức năng sau:
         *      1. Nhập n sản phẩm (n nhập từ bàn phím, ko nhập priceOut)
         *      2. Tính giá bán (priceOut) cho từng sản phẩm vừa nhập
         *      3. Hiển thị danh sách sản phẩm theo giá bán (salePrice) tăng dần
         *      4. Thoát
         * Để thực hiện chức năng, người dùng sẽ nhập 1 số nguyên x tương ứng chức năng ở trên.
         * Chương trình sẽ thực hiện lặp lại cho đến khi người dùng chọn chức năng 4. Thoát
         */
    }
}
