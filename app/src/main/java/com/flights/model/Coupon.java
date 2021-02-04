package com.flights.model;

import java.util.Objects;

public class Coupon {
    private int id;
    private double discount;

    public Coupon() {
    }

    public Coupon(int id, double discount) {
        this.id = id;
        this.discount = discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coupon)) return false;
        Coupon coupon = (Coupon) o;
        return id == coupon.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
