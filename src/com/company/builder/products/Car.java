package com.company.builder.products;

import com.company.builder.builders.CarBuilder;
import com.company.builder.engines.Engine;

public class Car extends CarBuilder {
    private int numberSeats;
    private Engine engine;
    private boolean TripComputers;
    private  boolean GPS;

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTripComputers(boolean tripComputers) {
        TripComputers = tripComputers;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }


    public int getNumberSeats() {
        return numberSeats;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean isTripComputers() {
        return TripComputers;
    }

    public boolean isGPS() {
        return GPS;
    }


    @Override
    public String toString() {
        return "Car{" +
                "numberSeats=" + numberSeats +
                ", engine=" + engine +
                ", TripComputers=" + TripComputers +
                ", GPS=" + GPS +
                '}';
    }
}