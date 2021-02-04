package com.flights.dao;

import com.flights.datasource.BaggageDatasource;
import com.flights.datasource.TicketDatasource;
import com.flights.model.Baggage;
import com.flights.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaggageDaoImpl implements BaggageDao {

    @Autowired
    private BaggageDatasource datasource;


    @Override
    public List<Baggage> get() {
        return datasource.getDatasource();
    }

    @Override
    public Baggage get(String id) {
        Baggage baggageToCheck=new Baggage();
        baggageToCheck.setId(id);
        return datasource.getDatasource().stream().filter(baggage -> baggage.equals(baggageToCheck)).findAny().orElse(null);
    }

    @Override
    public void save(Baggage ticket) {

    }

    @Override
    public void delete(String id) {

    }
}
