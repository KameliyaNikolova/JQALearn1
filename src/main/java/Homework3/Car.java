package Homework3;

public class Car {
    int year;
    int price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel = 70;
    String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        engineFuelOperationSystem = newEngineFuelOperationSystem;

    }
    public void useFuel(double fuel)    {
            if (freeFuel - fuel < 0) {
                System.out.println("Not enough free fuel!");
            }
            else {
                freeFuel = freeFuel - fuel;
            }
        }
    }

