package motorwatervehicles;

import Engine.Engine;

public class Sail extends MotorWaterVehicles {
    public String type;

    public Sail(String brand, int year, Engine engine, int numberOfEngine, int width, int height, int numberOfCabin, boolean registry, String hullMaterial,String type) {
        super(brand, year, engine, numberOfEngine, width, height, numberOfCabin, registry, hullMaterial);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sail{" +
                "type='" + type + '\'' +
                ", numberOfEngine=" + numberOfEngine +
                ", width=" + width +
                ", height=" + height +
                ", numberOfCabin=" + numberOfCabin +
                ", registry=" + registry +
                ", hullMaterial='" + hullMaterial + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }
}
