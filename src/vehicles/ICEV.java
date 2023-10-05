package vehicles;

import engines.CombustionEngine;
import engines.Engine;
import manufactures.Manufacture;

public class ICEV extends Vehicle{
    public ICEV(Manufacture manufacture, CombustionEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {

        String characteristics = "ICEV " +
                "(Internal Combustion Engine Vehicle): " +
                "\n\t" + "Manufacture: " + super.manufacture +
                "\n\t" + "Engine: " + super.engine;

        System.out.println(characteristics);
    }
}
