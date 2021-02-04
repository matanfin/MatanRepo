package com.flights.datasource;


import com.flights.model.Baggage;
import com.flights.model.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
// this should be depend on destination datasource and source datasource @DependsOn in order to populate by name
public class BaggageDatasourceImpl implements BaggageDatasource {

    private static final Logger logger = LoggerFactory.getLogger(BaggageDatasourceImpl.class);
    List<Baggage> baggages;


    @Override
    public List<Baggage> getDatasource() {
        return baggages;
    }


    @PostConstruct
    @Override
    public void populateDataSource() {
    baggages=Arrays.asList(
            new Baggage("1",2,3,20.1),
            new Baggage("2",2,3,20.1),
            new Baggage("3",2,3,20.1));
    }
}



