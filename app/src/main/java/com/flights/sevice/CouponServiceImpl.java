package com.flights.sevice;


import com.flights.dao.CouponDao;
import com.flights.datasource.CouponDatasourceImpl;
import com.flights.model.Coupon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CouponServiceImpl implements CouponService {
    private static final Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);
    @Autowired
    CouponDao dao;

    @Override
    public Double getPriceAfterCouponApplied(int couponId, double price) {
        Coupon coupon = dao.get(couponId);
        if (coupon!=null){
            double discount = coupon.getDiscount();
            logger.info("the discount is: "+discount);
            return getReducedPrice(discount,price);
        }
        return null;
    }

    private double getReducedPrice(double discount,double price) {
        return (1-(discount/100))*price;
    }
}
