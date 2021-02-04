package com.flights.controller;

import com.flights.sevice.CouponService;
import com.flights.sevice.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/flights/coupon")
public class CouponController {

    @Autowired
    CouponService couponService;

    @GetMapping("/price1/{couponId}")
    public double applyCoupon(@PathVariable @NotNull int couponId ) {
        return 111;
    }


    @GetMapping("/price/{couponId}")
    public ResponseEntity<Double> applyCoupon(@PathVariable @NotNull int couponId, @RequestParam @NotNull double price ) {


        Double priceAfterCouponApplied = couponService.getPriceAfterCouponApplied(couponId, price);

        if (priceAfterCouponApplied==null){
           return new ResponseEntity<Double>(price, HttpStatus.NOT_FOUND);

        }
        return  new ResponseEntity<>(priceAfterCouponApplied,HttpStatus.OK);

    }
}
