package Engine;

public class Engine {

    private String enginePower;
    private String engineVolume;
    private FuelType fuelType;
    private int DEFAULT_ENGINE_POWER = 110;
    private int DEFAULT_ENGINE_VOLUME = 1000;


    public Engine(String enginePower, String engineVolume, FuelType fuelType) {
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

    public Engine(FuelType fuelType, int DEFAULT_ENGINE_POWER, int DEFAULT_ENGINE_VOLUME) {
        this.fuelType = fuelType;
        this.DEFAULT_ENGINE_POWER = DEFAULT_ENGINE_POWER;
        this.DEFAULT_ENGINE_VOLUME = DEFAULT_ENGINE_VOLUME;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower='" + enginePower + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", fuelType=" + fuelType +
                '}';
    }
}
