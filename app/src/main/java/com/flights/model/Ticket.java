package com.flights.model;

import java.util.Date;
import java.util.Objects;

public class Ticket {
    private int id;
    private String personId;
    private int source;
    private int destination;
    private Date dateAndTime;

    public Ticket(int id, String personId, int source, int destination, Date dateAndTime) {
        this.id = id;
        this.personId = personId;
        this.source = source;
        this.destination = destination;
        this.dateAndTime = dateAndTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id && Objects.equals(personId, ticket.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personId);
    }
}
