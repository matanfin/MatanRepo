package com.flights.dao;

import com.flights.model.Baggage;
import com.flights.model.Ticket;

import java.util.List;

public interface BaggageDao {




        List<Baggage> get();

        Baggage get(String id);

        void save(Baggage ticket);

        void delete( String id);

}
