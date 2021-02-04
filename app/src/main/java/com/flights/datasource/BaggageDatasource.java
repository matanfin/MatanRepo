package com.flights.datasource;

import com.flights.datasource.base.Datasource;
import com.flights.model.Baggage;

import javax.annotation.PostConstruct;
import java.util.List;

public interface BaggageDatasource extends Datasource {

    @PostConstruct
    List<Baggage> getDatasource();
}
