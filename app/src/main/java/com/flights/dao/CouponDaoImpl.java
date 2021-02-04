package com.flights.dao;

import com.flights.datasource.CouponDatasource;
import com.flights.model.Baggage;
import com.flights.model.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CouponDaoImpl implements CouponDao {
    @Autowired
    CouponDatasource datasource;
    @Override
    public List<Coupon> get() {
        return datasource.getDatasource();
    }

    @Override
    public Coupon get(int id) {
        Coupon couponToCheck=new Coupon();
        couponToCheck.setId(id);
        return datasource.getDatasource().stream().filter(coupon -> coupon.equals(couponToCheck)).findAny().orElse(null);
    }

    @Override
    public void save(Coupon coupon) {

    }

    @Override
    public void delete(int id) {

    }
}
