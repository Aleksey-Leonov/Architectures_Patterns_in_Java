package com.company.structuralPatterns.bridge;

import com.company.structuralPatterns.bridge.devices.Device;

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if(device.isEnabled()){
            device.disable();
        }else device.enable();
    }

    public void volumeDown(){
        device.setVolume(device.getVolume()-10);
    }

    public void volumeUp(){
        device.setVolume(device.getVolume()+10);
    }



}
