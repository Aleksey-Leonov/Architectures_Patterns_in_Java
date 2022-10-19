package com.company.builder.builders;

import com.company.builder.engines.Engine;

public interface Builder {

    void reset();
    void setSeats(int number);
    void setEngine(Engine engine);
    void setTripComputer(boolean b);
    void setGPS(boolean b);
}
