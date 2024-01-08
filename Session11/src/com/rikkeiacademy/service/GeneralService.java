package com.rikkeiacademy.service;

public interface GeneralService {
    void add();

    default void testDefault() {
        System.out.println("Default method java 8");
    }
}
