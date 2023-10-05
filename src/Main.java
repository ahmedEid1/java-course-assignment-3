import engines.CombustionEngine;
import engines.ElectricEngine;
import engines.HybridEngine;
import manufactures.Manufacture;
import vehicles.BEV;
import vehicles.HybridV;
import vehicles.ICEV;
import vehicles.Vehicle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // engines
        CombustionEngine combustionEngine1 = new CombustionEngine(200);
        CombustionEngine combustionEngine2 = new CombustionEngine(400);

        ElectricEngine electricEngine1 = new ElectricEngine(300);
        ElectricEngine electricEngine2 = new ElectricEngine(600);

        HybridEngine hybridEngine1 = new HybridEngine(250);
        HybridEngine hybridEngine2 = new HybridEngine(500);

        // manufactures
        Manufacture manufacture1 = new Manufacture();
        manufacture1.setName("Manufacture 1");
        manufacture1.setAddress("Address 1");
        manufacture1.setPhoneNumber("Phone Number 1");
        manufacture1.setEmail("test1@gmail.com");

        Manufacture manufacture2 = new Manufacture();
        manufacture2.setName("Manufacture 2");
        manufacture2.setAddress("Address 2");
        manufacture2.setPhoneNumber("Phone Number 2");
        manufacture2.setEmail("test2@gmail.com");


        // vehicles
        ICEV icev1 = new ICEV(manufacture1, combustionEngine1);
        ICEV icev2 = new ICEV(manufacture2, combustionEngine2);

        BEV bev1 = new BEV(manufacture1, electricEngine1);
        BEV bev2 = new BEV(manufacture2, electricEngine2);

        HybridV hybridv1 = new HybridV(manufacture1, hybridEngine1);
        HybridV hybridv2 = new HybridV(manufacture2, hybridEngine2);

        // Create arrays of Vechicle which contains objects of ICEV, BEV, HybridV.
        Vehicle[] vehicles = { icev1, icev2, bev1, bev2, hybridv1, hybridv2,  };

        Arrays.stream(vehicles).forEach(Vehicle::ShowCharacteristics);
    }
}