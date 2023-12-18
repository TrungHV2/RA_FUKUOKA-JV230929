package com.ra;

import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            Student st = new Student();
            System.out.print("Nhập mã sinh viên: ");
            st.setId(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhập họ đệm: ");
            st.setFirstName(sc.nextLine());
            System.out.print("Nhập tên: ");
            st.setLastName(sc.nextLine());
            System.out.print("Nhập giới tính: ");
            st.setGender(Boolean.parseBoolean(sc.nextLine()));
            students.add(st);
        }
        Set<String> firstNames = new HashSet<>();
        students.forEach(x -> firstNames.add(x.getFirstName()));

        Map<String, List<Student>> data = new HashMap<>();

        firstNames.forEach(x -> {
            System.out.println(x);
            students.forEach(sv -> {
                if (sv.getFirstName().equals(x))
                    System.out.println("\t" + sv.getFirstName() + " " + sv.getLastName() + " | Giới tính: " + (sv.isGender() ? "Nam" : "Nữ"));
            });
        });
    }
}
