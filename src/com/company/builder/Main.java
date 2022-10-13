package com.company.builder;

import com.company.builder.builders.CarBuilder;
import com.company.builder.products.Car;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructorSportCar(builder);
        Car car = builder.getResult();

        System.out.println(car.toString());
    }
}
