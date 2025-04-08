package casting;

public class FanDetails extends Fan {
    @Override
    public void function() {
        System.out.println("Overridden: function in FanDetails");
    }

    @Override
    public void types() {
        System.out.println("Overridden: types in FanDetails");
    }

    @Override
    public void powerSource() {
        System.out.println("Overridden: powerSource in FanDetails");
    }

    @Override
    public void speedControl() {
        System.out.println("Overridden: speedControl in FanDetails");
    }

    @Override
    public void energyConsumption() {
        System.out.println("Overridden: energyConsumption in FanDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FanDetails");
    }
}
