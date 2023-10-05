package vehicles;

import engines.ElectricEngine;
import engines.Engine;
import manufactures.Manufacture;

public class BEV extends Vehicle{
    public BEV(Manufacture manufacture, ElectricEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {

        String characteristics = "BEV " +
                "(Battery Electric Vehicle): " +
                "\n\t" + "Manufacture: " + super.manufacture +
                "\n\t" + "Engine: " + super.engine;

        System.out.println(characteristics);
    }
}
