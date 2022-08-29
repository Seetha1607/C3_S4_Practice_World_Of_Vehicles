package com.engine;

public class EngineImpl {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setModelNumber("AB-3478SN");
        engine.setDisplacement(1497);
        engine.setMaxHorsePower(117);
        engine.setRevolutionsPerMinute(6600);
        engine.setNumberOfCylinders(4);
        System.out.println("Model Number of Engine : " + engine.getModelNumber());
        System.out.println("Displacement of Engine : " + engine.getDisplacement() + "cc");
        System.out.println("Maximum Horse power of Engine : " + engine.getMaxHorsePower() + "bhp");
        System.out.println("Revolutions per minute of Engine : " + engine.getRevolutionsPerMinute() + "rpm");
        System.out.println("Number of cylinders in Engine : " + engine.getNumberOfCylinders());

        PetrolEngine petrol = new PetrolEngine();
        petrol.setFuelType("Petrol");
        System.out.println("The fuel type of Petrol Engine : " + petrol.getFuelType());

        DieselEngine diesel = new DieselEngine();
        diesel.setFuelType("Diesel");
        System.out.println("The fuel type of Diesel Engine : " + diesel.getFuelType());

        CNGEngine cng = new CNGEngine();
        cng.setFuelType("CNG");
        System.out.println("The fuel type of CNG Engine : " + cng.getFuelType());

        ElectricEngine electric = new ElectricEngine();
        electric.setVoltage(50.3);
        System.out.println("The voltage of Electric Engine : " + electric.getVoltage() + "kWh");
    }
}