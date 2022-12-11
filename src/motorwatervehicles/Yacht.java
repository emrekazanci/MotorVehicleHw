package motorwatervehicles;

import Engine.Engine;

public class Yacht extends MotorWaterVehicles{
    public int numberOfBeds;
    public String engineBrand;

    public Yacht(String brand, int year, Engine engine, int numberOfEngine, int width, int height, int numberOfCabin, boolean registry, String hullMaterial,int numberOfBeds,String engineBrand) {
        super(brand, year, engine, numberOfEngine, width, height, numberOfCabin, registry, hullMaterial);
        this.engineBrand = engineBrand;
        this.numberOfBeds = numberOfBeds;

    }

    @Override
    public String toString() {
        return "Yacht{" +
                "numberOfBeds=" + numberOfBeds +
                ", engineBrand='" + engineBrand + '\'' +
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
