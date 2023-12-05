package com.ra.model;

import com.ra.Person;

public class Employee {
    private String employeeId;
    private String employeeName;
    private double salary;

    // Alt + Insert > Constructor
    public Employee() {
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(String employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    // Alt + Insert > Getter and Setter
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void test() {
        Person p = new Person();
        //System.out.println("Xin chào! Tôi tên là " + p.name); // error
        //System.out.println("Email: " + p.email); // error
        //System.out.println("SĐT: " + p.phone); // error
        System.out.println("Địa chỉ: " + p.address);
    }
}
