package com.flights.datasource;

import com.flights.datasource.base.Datasource;
import com.flights.model.Coupon;
import com.flights.model.Ticket;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface CouponDatasource extends Datasource {
     final List<Double> discounts=Arrays.asList(10d,50d,60d);
    List<Coupon> getDatasource();
    Double getRandomDiscount();

}
