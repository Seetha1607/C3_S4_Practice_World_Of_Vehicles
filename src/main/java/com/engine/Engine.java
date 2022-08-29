/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 29-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.engine;

public class Engine {
    private String modelNumber;
    private float displacement;
    private float maxHorsePower;
    private int numberOfCylinders;
    private int revolutionsPerMinute;

    public Engine() {
    }

    public Engine(String modelNumber, float displacement, float maxHorsePower, int numberOfCylinders, int revolutionsPerMinute) {
        this.modelNumber = modelNumber;
        this.displacement = displacement;
        this.maxHorsePower = maxHorsePower;
        this.numberOfCylinders = numberOfCylinders;
        this.revolutionsPerMinute = revolutionsPerMinute;
    }
}
