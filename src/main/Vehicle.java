package main;

import lib.IEngine;
import lib.IWheels;

//Class Vehicle implements two interfaces IWheels and IEngine
//The class MUST describe all the methods which are given in the interfaces
public class Vehicle implements IWheels, IEngine {
    int wheels;
    String engineSpecs;

//    setters and getters are used from interface for local class variables wheels and engineSpecs
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngineSpecs() {
        return engineSpecs;
    }

    public void setEngineSpecs(String engineSpecs) {
        this.engineSpecs = engineSpecs;
    }
}
