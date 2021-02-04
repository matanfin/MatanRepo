package com.flights.sevice;

public interface TicketService {

    /**
     * ticket is available if if it does not belong to any person-> personId=null
     * @return
     */

    boolean isTicketAvailable( int ticketId);
}
