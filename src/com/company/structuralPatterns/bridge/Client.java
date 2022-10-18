package com.company.structuralPatterns.bridge;

import com.company.structuralPatterns.bridge.devices.TV;

public class Client {



    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote =  new Remote(tv);
        remote.togglePower();
    }
}
