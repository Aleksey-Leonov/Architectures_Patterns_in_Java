package com.company.builder;

import com.company.builder.builders.Builder;
import com.company.builder.engines.SportEngine;

public class Director {

    public void constructorSportCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGPS(true);
    }


}
