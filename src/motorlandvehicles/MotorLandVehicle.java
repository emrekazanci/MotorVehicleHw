package motorlandvehicles;

import Engine.Engine;
import Engine.MotorVehicle;

public abstract class MotorLandVehicle extends MotorVehicle {
    public  String licencePlate;
    public int numberOfWheels;

    public MotorLandVehicle(String brand, int year, Engine engine, String licencePlate, int numberOfWheels) {
        super(brand, year, engine);
        this.licencePlate = licencePlate;
        this.numberOfWheels = numberOfWheels;
    }
}
