package vehicles;

import engines.Engine;
import manufactures.Manufacture;

//Create superclass Vehicle with abstract method ShowCharacteristics(). Create three subclasses ICEV, BEV, HybridV.
public abstract class Vehicle {
    // Each subclass of class Vehicle should have attribute of class Manufacture and Engine.
    protected Manufacture manufacture;
    protected Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }
    // this method will print the characteristics of the vehicle
    public abstract void ShowCharacteristics();

}
