import Engine.*;
import motorlandvehicles.Car;
import motorwatervehicles.Sail;
import motorwatervehicles.Yacht;

public class Main {
    public static void main(String[] args) {

        Engine carEngine = new Engine("150hp", "1500c", FuelType.GASOLINE);
        Car car = new Car("Bmw", 2019, carEngine, "06AB06", 4, 5);

        System.out.println(car);
        car.engine.setEnginePower("170hp");
        carEngine.setFuelType(FuelType.DIESEL);
        System.out.println(car);

        System.out.println("---------------");

        Engine sailEngine = new Engine("300hp", "1600cc", FuelType.BENZINE);
        Sail sail = new Sail("AAA", 2005, sailEngine, 2, 150, 700,
                1, true, "wood", "Main Sail");
        System.out.println(sail);
        sail.hullMaterial = "iron";
        System.out.println(sail);

        System.out.println("-------------");

        Engine yachtEngine = new Engine("450hp","3500cc",FuelType.BENZINE);
        Yacht yact = new Yacht("YamahaMotors",2018,yachtEngine,3,4300,9500,
                5,true,"Wood",6,"Yamaha");
        System.out.println(yact);
    }
}
