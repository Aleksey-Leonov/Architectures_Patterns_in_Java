package com.company.builder;

import com.company.builder.builders.CarBuilder;
import com.company.builder.builders.CarManualBuilder;
import com.company.builder.products.Car;

public class Applications {

    void makeCar(){
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructorSportCar(builder);
        Car car = builder.getResult();


    }
}
