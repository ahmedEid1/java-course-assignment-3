package engines;

//Create superclass Engine and subclasses CombustionEngine, ElectricEngine and HybridEngine.
public class Engine {
    private final String name;
    private final String fuelType;
    private final int horsePower;

    public Engine(String name, String fuelType, int horsePower) {
        this.name = name;
        this.fuelType = fuelType;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }


    @Override
    public String toString() {
        return "{" + "name=" + getName() + ", fuelType=" + getFuelType() + ", horsePower=" + getHorsePower() + '}';
    }
}
