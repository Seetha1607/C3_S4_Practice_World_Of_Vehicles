/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 29-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.engine;

public class ElectricEngine extends Engine {
    private float voltage;

    public ElectricEngine() {
    }

    public ElectricEngine(String modelNumber, int displacement, float maxHorsePower, int numberOfCylinders, int revolutionsPerMinute, float voltage) {
        super(modelNumber, displacement, maxHorsePower, numberOfCylinders, revolutionsPerMinute);
        this.voltage = voltage;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }
}
