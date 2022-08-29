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

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public float getMaxHorsePower() {
        return maxHorsePower;
    }

    public void setMaxHorsePower(float maxHorsePower) {
        this.maxHorsePower = maxHorsePower;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getRevolutionsPerMinute() {
        return revolutionsPerMinute;
    }

    public void setRevolutionsPerMinute(int revolutionsPerMinute) {
        this.revolutionsPerMinute = revolutionsPerMinute;
    }
}
