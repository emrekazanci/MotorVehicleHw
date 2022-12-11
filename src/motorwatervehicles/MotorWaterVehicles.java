package motorwatervehicles;

import Engine.Engine;
import Engine.MotorVehicle;

public abstract class MotorWaterVehicles extends MotorVehicle {
    public int numberOfEngine, width, height, numberOfCabin;
    public boolean registry;
    public String hullMaterial;

    public MotorWaterVehicles(String brand, int year, Engine engine, int numberOfEngine, int width, int height, int numberOfCabin, boolean registry, String hullMaterial) {
        super(brand, year, engine);
        this.numberOfEngine = numberOfEngine;
        this.width = width;
        this.height = height;
        this.numberOfCabin = numberOfCabin;
        this.registry = registry;
        this.hullMaterial = hullMaterial;
    }
}
