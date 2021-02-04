package com.flights.datasource;

import com.flights.datasource.base.Datasource;
import com.flights.model.Ticket;


import java.util.List;

public interface TicketDatasource extends Datasource {

    List<Ticket> getDatasource();
}
