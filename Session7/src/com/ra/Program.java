package com.ra;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nam");
        names.add("Nam");
        for (String item : names) {
            System.out.println(item);
        }
        Set<String> distinctNames = new HashSet<>();
        distinctNames.add("Hoàng");
        distinctNames.add("Hoàng");
        distinctNames.forEach(item -> System.out.println(item));

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("A", 5);
        stringIntegerMap.put("A", 7);
        stringIntegerMap.put("B", 17);
        stringIntegerMap.keySet().forEach(key -> System.out.println(key + ": " +stringIntegerMap.get(key)));

        int a = sum(5, 7);
        int b = sum(6, 9);

        swap(5, 7);
        swap("A", "C");

        GenericService<String> genericService = new GenericService<>();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static <T> void swap(T a, T b) {
        T temp = a;
        a = b;
        b = temp;
    }
    public static void swapStr(String str1, String str2) {
        String temp = str1;
        str1 = str2;
        str2 = temp;
    }
    public static void swapInt(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
