package com.flights.model;

import java.util.Objects;

public class Baggage {
    private String id;
    private int destinationId;
    private int sourceId;
    private double weight;

    public Baggage() {
    }

    public Baggage(String id, int destinationId, int sourceId, double weight) {
        this.id = id;
        this.destinationId = destinationId;
        this.sourceId = sourceId;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Baggage)) return false;
        Baggage baggage = (Baggage) o;
        return id.equals(baggage.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
