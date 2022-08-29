package com.engine;

public class EngineImpl {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setModelNumber("AB-3478SN");
        engine.setDisplacement(1497);
        engine.setMaxHorsePower(117);
        engine.setRevolutionsPerMinute(6600);
        engine.setNumberOfCylinders(4);
    }
}