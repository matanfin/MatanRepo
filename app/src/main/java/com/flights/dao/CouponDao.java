package com.flights.dao;

import com.flights.model.Coupon;
import com.flights.model.Ticket;

import java.util.List;

public interface CouponDao {
    List<Coupon> get();

    Coupon get (int id);

    void save(Coupon coupon);

    void delete( int id);
}
