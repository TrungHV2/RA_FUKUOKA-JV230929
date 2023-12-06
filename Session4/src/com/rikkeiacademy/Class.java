package com.rikkeiacademy;

public class Class {
    private Student[] students;

    /**
     * Thêm học viên vào lớp. Không thêm học viên trùng mã học viên(id).
     * @param st Đối tượng học viên được thêm vào lớp
     * @return Thêm thành công trả về true, ngược lại trả về false.
     */
    public boolean add(Student st) {
        return true;
    }

    /**
     * Cập nhật thông tin của học viên trong lớp, cập nhật tất cả thông tin ngoại trừ mã học viên(id)
     * @param st Đối tượng chứa thông tin mới của học viên được cập nhật.
     * @return Cập nhật thành công trả về true, ngược lại trả về false.
     */
    public boolean edit(Student st) {
        return true;
    }
    /**
     * Xóa học viên khỏi lớp
     * @param st Đối tượng học viên cần xóa
     * @return Xóa thành công trả về true, ngược lại trả về false.
     */
    public boolean remove(Student st) {
        return true;
    }
    /**
     * Trả về vị trí học viên trong lớp
     * @param id Mã học viên cần tìm
     * @return x - là vị trí của học viên trong lớp
     */
    public int findIndex(String id) {
        return 0;
    }

    /**
     * Trả về đối tượng học viên trong lớp
     * @param id Mã học viên cần tìm
     * @return trả về đối tượng học viên(Student) được tìm thấy theo mã học viên(id) truyền vào.
     */
    public Student findId(String id) {
        return null;
    }
}
