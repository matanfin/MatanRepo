package com.flights.dao;

import com.flights.datasource.TicketDatasource;
import com.flights.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketDaoImpl implements TicketDao {

    @Autowired
    private TicketDatasource datasource;

    @Override
    public List<Ticket> get() {
        return datasource.getDatasource();
    }

    @Override
    public Ticket get(int id, String personId) {
        return null;
    }

    @Override
    public void save(Ticket ticket) {

    }

    @Override
    public void delete(int id, String personId) {

    }
}
