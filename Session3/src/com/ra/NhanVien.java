package com.ra;

public class NhanVien {
    // Fields: lưu trữ thông tin về đối tượng
    private String id;
    private String name;

    // Constructors: khởi tạo đối tượng
    public NhanVien() {

    }
    public NhanVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter: lấy dữ liệu từ các fields private
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    // Setter: truyền dữ liệu vào các field private
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Behaviors: thực hiện các hành động xử lý logic nghiệp vụ
    public void hello() {
        System.out.println("Xin chào các bạn!");
    }
}
