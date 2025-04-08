package casting;

public class FanCast {
    public void cast(Fan fan) {
        System.out.println("Casting Fan");
        fan.function();
        fan.types();
        fan.powerSource();
        fan.speedControl();
        fan.energyConsumption();
        if(fan instanceof FanDetails) {
            FanDetails ref = (FanDetails)fan;
            ref.extraMethod();
        }
    }
}
