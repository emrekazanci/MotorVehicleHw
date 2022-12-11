package motorlandvehicles;

import Engine.Engine;
import Engine.MotorVehicle;

public class Car extends MotorLandVehicle {
    public int numberOfDoors;

    public Car(String brand, int year, Engine engine, String licencePlate, int numberOfWheels,int numberOfDoors) {
        super(brand, year, engine, licencePlate, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
