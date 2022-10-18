package com.company.structuralPatterns.bridge.devices;

public class Radio implements Device{
    @Override
    public boolean isEnabled() {

        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public double getVolume() {

        return 0;
    }

    @Override
    public void setVolume(double percent) {

    }

    @Override
    public void getChannel() {

    }

    @Override
    public void setChannel(String channel) {

    }
}
