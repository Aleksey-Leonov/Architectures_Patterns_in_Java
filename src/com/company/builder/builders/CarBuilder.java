package com.company.builder.builders;

import com.company.builder.products.Car;
import com.company.builder.engines.Engine;

public class CarBuilder implements Builder{
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setNumberSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean b) {
        car.setTripComputers(b);
    }

    @Override
    public void setGPS(boolean b) {
        car.setGPS(b);
    }



    public Car getResult(){
        return this.car;
    }

}
