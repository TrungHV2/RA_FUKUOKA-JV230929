package com.ra;

import com.ra.model.Student;

public class Program {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        NhanVien nv = new NhanVien();
        nv.setName("New Name");
        System.out.println("Mã NV: " + nv.getName());
        nv.hello();
        NhanVien nv1 = new NhanVien("NV01", "Nam");
        System.out.println("Mã NV1: " + nv1.getName());
        nv1.hello();

        // Định nghĩa lớp SinhVien, lưu thông tin về maSV, ten, email, sdt, diaChi.
        // Khởi tạo đối tương sinh viên từ lớp SinhVien vừa định nghĩa.
        // Nhập dữ liệu cho đối tượng sinh viên và hiển thị thông tin ra màn hình

        Person p = new Person();
        //System.out.println("Xin chào! Tôi tên là " + p.name); // error
        System.out.println("Email: " + p.email);
        System.out.println("SĐT: " + p.phone);
        System.out.println("Địa chỉ: " + p.address);

        Student st = new Student();
        Student st1 = new Student();
        System.out.println(st.school);
        System.out.println(st1.school);
        System.out.println(Student.school);
        Student.school = "Hà Nội";
        System.out.println(st.school);
        System.out.println(st1.school);
        System.out.println(Student.school);
    }
}
