package com.flights.datasource;

import com.flights.model.Coupon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class CouponDatasourceImpl implements CouponDatasource{
    private static final Logger logger = LoggerFactory.getLogger(CouponDatasourceImpl.class);
private List <Coupon> coupons;

    @PostConstruct
    @Override
    public void populateDataSource() {
    coupons= Arrays.asList(new Coupon(1,getRandomDiscount()),
            new Coupon(2,getRandomDiscount()),
            new Coupon(3,getRandomDiscount()));

    }

    @Override
    public List<Coupon> getDatasource() {
        return coupons;
    }

    @Override
    public Double getRandomDiscount() {
        Random randomGenerator=  new Random();;
        int index = randomGenerator.nextInt(discounts.size());
        return discounts.get(index);
    }


}
