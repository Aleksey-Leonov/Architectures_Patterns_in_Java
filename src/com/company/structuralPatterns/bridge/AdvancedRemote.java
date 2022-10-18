package com.company.structuralPatterns.bridge;

import com.company.structuralPatterns.bridge.devices.Device;

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }


}
