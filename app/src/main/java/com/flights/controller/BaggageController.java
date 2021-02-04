package com.flights.controller;


import com.flights.sevice.BaggageService;
import com.flights.sevice.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/flights/baggage")
public class BaggageController {
    @Autowired
    BaggageService baggageService;

    @GetMapping("/{baggageId}/{destinationId}")
    public boolean get(@PathVariable @NotNull int destinationId,@PathVariable @NotNull String baggageId) {
        return baggageService.isCheckInSucceded(destinationId, baggageId);

    }
}
