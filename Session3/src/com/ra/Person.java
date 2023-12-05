package com.ra;

public class Person {
    private String name = "Tên";
    String email = "Email";
    protected String phone = "Phone";
    public String address = "Hà Nội";

    public void hello() {
        System.out.println("Xin chào! Tôi tên là " + name);
        System.out.println("Email: " + email);
        System.out.println("SĐT: " + phone);
        System.out.println("Địa chỉ: " + address);
    }
}
