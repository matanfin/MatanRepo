package com.flights.sevice;

import com.flights.dao.BaggageDao;
import com.flights.model.Baggage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaggageServiceImpl implements BaggageService{

    @Autowired
   BaggageDao baggageDao;

    @Override
    public boolean isCheckInSucceded(int destinationId, String baggageId) {
        Baggage baggage = baggageDao.get(baggageId);

        return destinationId== baggage.getDestinationId()?true:false;
    }
}
