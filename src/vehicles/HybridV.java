package vehicles;

import engines.Engine;
import engines.HybridEngine;
import manufactures.Manufacture;

public class HybridV extends Vehicle{
    public HybridV(Manufacture manufacture, HybridEngine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {

        String characteristics = "HybridV " +
                "(Hybrid Vehicle): " +
                "\n\t" + "Manufacture: " + super.manufacture +
                "\n\t" + "Engine: " + super.engine;

        System.out.println(characteristics);
    }

    // setter

}
