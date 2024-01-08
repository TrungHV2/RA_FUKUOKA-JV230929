package com.rikkeiacademy.functional;

@FunctionalInterface
public interface MyFunc<T> {
    boolean test(T obj);
}
