package com.ra.model;

import com.ra.Person;

public class Student extends Person {
    public static String school = "RikkeiAcademy";

    public void test() {
        //System.out.println("Xin chào! Tôi tên là " + name); // error
        //System.out.println("Email: " + email); // error
        System.out.println("SĐT: " + phone);
        System.out.println("Địa chỉ: " + address);
    }
}
