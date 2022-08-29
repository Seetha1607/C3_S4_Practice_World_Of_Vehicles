/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 29-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.engine;

public class DieselEngine extends Engine {
    private String fuelType;

    public DieselEngine() {
    }

    public DieselEngine(String modelNumber, float displacement, float maxHorsePower, int numberOfCylinders, int revolutionsPerMinute, String fuelType) {
        super(modelNumber, displacement, maxHorsePower, numberOfCylinders, revolutionsPerMinute);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
