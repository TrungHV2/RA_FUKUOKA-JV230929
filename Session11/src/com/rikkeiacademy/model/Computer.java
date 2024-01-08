package com.rikkeiacademy.model;

import java.util.Date;

public class Computer {
    private String id;
    private Date start;
    private double price;
    private boolean status = false;

    public Computer() {
    }

    public Computer(String id, Date start, double price, boolean status) {
        this.id = id;
        this.start = start;
        this.price = price;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double pay() {
        this.status = false;
        final double MILLI_TO_HOUR = 1000 * 60 * 60;
        long diffTime = new Date().getTime() - this.start.getTime();
        double hours = diffTime / MILLI_TO_HOUR;
        return hours * this.price;
    }
    public void on() {
        this.status = true;
        this.start = new Date();
    }
}
