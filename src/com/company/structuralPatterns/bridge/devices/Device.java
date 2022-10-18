package com.company.structuralPatterns.bridge.devices;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    double getVolume();
    void setVolume(double percent);
    void getChannel();
    void setChannel(String channel);
}
