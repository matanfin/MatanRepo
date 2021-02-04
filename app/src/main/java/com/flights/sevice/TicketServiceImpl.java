package com.flights.sevice;

import com.flights.dao.TicketDao;
import com.flights.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketDao ticketDao;

    @Override
    public boolean isTicketAvailable( int ticketId) {
        List<Ticket> tickets = ticketDao.get();

        Ticket ticket = tickets.stream().filter(t -> t.getId() == ticketId && t.getPersonId() == null).findAny().orElse(null);
        return ticket!=null?true:false;

    }
}
