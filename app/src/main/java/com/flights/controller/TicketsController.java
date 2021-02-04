package com.flights.controller;


import com.flights.sevice.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/flights/ticket")
public class TicketsController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/{ticketId}")
    public boolean isTicketAvailable(@PathVariable @NotNull int ticketId) {
        return ticketService.isTicketAvailable(ticketId);

    }
}
