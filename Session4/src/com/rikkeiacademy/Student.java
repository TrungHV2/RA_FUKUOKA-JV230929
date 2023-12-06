package com.rikkeiacademy;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private double markCss;
    private double markHtml;
    private double markJs;
    private double markAvg;

    public Student() {
    }

    public Student(String id, String firstName, String lastName, double markCss, double markHtml, double markJs) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.markCss = markCss;
        this.markHtml = markHtml;
        this.markJs = markJs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMarkCss() {
        return markCss;
    }

    public void setMarkCss(double markCss) {
        this.markCss = markCss;
    }

    public double getMarkHtml() {
        return markHtml;
    }

    public void setMarkHtml(double markHtml) {
        this.markHtml = markHtml;
    }

    public double getMarkJs() {
        return markJs;
    }

    public void setMarkJs(double markJs) {
        this.markJs = markJs;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    /**
     * Tính điểm trung bình của học viên
     */
    public void calculateAvg() {
    }

    /**
     * Nhập thông tin cho học viên (có thêm tham số cho hàm nếu cần)
     */
    public void input() {

    }

    /**
     * Hiển thị thông tin học viên ra màn hình
     */
    public void output() {

    }
}
