package Polymorphism;

public class Runner {
    public static void main(String[] args) {
        Rubber rubber=new Rubber();
        rubber.expand();
        Tyre tyre= new Tyre();
        tyre.expand();


        Rubber rubber1=new Rubber();
        rubber1.expand();

        MRFTyre mrfTyre=new MRFTyre();

        ArmyVehicle armyVehicle=new ArmyVehicle();
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(mrfTyre);
        Rubber rubber2=new Tyre();
        rubber2.expand();
        rubber2.compress();
    }

}
