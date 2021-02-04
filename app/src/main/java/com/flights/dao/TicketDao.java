package com.flights.dao;

import com.flights.model.Ticket;

import java.util.List;

public interface TicketDao {




        List<Ticket> get();

        Ticket get(int id, String personId);

        void save(Ticket ticket);

        void delete( int id, String personId);

}
