package Homework3;

public class CarPerson {

    public static void main(String args[])  //static method
    {
        
        Car Car1 = new Car();
        Car1.year = 2020;
        Car1.price = 50000;
        Car1.fuelTankCapacity = 50;
        Car1.freeFuel = 50;
        Car1.engineFuelOperationSystem = "Diesel";
        Car1.useFuel(15);
        Car1.isSportCar = false;
        Car Car2 = new Car();
        Car2.year = 2023;
        Car2.price = 100000;
        Car2.fuelTankCapacity = 80;
        Car2.freeFuel = 80;
        Car2.engineFuelOperationSystem = "Gas";
        Car2.isSportCar = true;
        Car2.changeEngineFuelOperationSystem("Petrol");

        System.out.println("=========================================");
        System.out.println("Car1-year: " + Car1.year);
        System.out.println("Car1-price: " + Car1.price);
        System.out.println("Car1-fuelITankCapacity: " + Car1.fuelTankCapacity);
        System.out.println("Car1-freeFuel: " + Car1.freeFuel);
        System.out.println("Car1-engineFuelOperationSystem: " + Car1.engineFuelOperationSystem);
        System.out.println("Car1-isSportCar: " + Car1.isSportCar);
        System.out.println("=========================================");
        System.out.println("Car2-year: " + Car2.year);
        System.out.println("Car2-price: " + Car2.price);
        System.out.println("Car2-fuelITankCapacity: " + Car2.fuelTankCapacity);
        System.out.println("Car2-freeFuel: " + Car2.freeFuel);
        System.out.println("Car2-engineFuelOperationSystem: " + Car2.engineFuelOperationSystem);
        System.out.println("Car2-isSportCar: " + Car2.isSportCar);
    }
}
