package com.flights.datasource;


import com.flights.model.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class TicketDatasourceImpl implements TicketDatasource {

    private static final Logger logger = LoggerFactory.getLogger(TicketDatasourceImpl.class);
    List <Ticket> tickets;


    @PostConstruct
    @Override
    public void populateDataSource() {

        logger.info("***************** POSTCON tickets");
        this.tickets= Arrays.asList(
                new Ticket(1,"p1",55,66,new Date()),
                new Ticket(1,"p1",55,66,new Date()),
                new Ticket(1,null,55,66,new Date()),
                new Ticket(2,"p1",55,66,new Date()),
                new Ticket(3,"p2",55,66,new Date()),
                new Ticket(4,"p3",55,66,new Date()),
                new Ticket(1,"p1",55,66,new Date()),
                new Ticket(2,"p1",55,66,new Date()),
                new Ticket(3,"p2",55,66,new Date()),
                new Ticket(4,"p3",55,66,new Date()));
    }

    @Override
    public List<Ticket> getDatasource() {
        return this.tickets;
    }
}
