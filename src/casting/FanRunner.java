package casting;

public class FanRunner {
    public static void main(String[] args) {

        Fan fan = new Fan();
        fan.function();
        fan.types();
        fan.powerSource();
        fan.speedControl();
        fan.energyConsumption();
        System.out.println("----------------------");

        Fan fanPoly = new FanDetails();
        fanPoly.function();
        fanPoly.types();
        fanPoly.powerSource();
        fanPoly.speedControl();
        fanPoly.energyConsumption();
        System.out.println("----------------------");

        FanDetails fanDetails = new FanDetails();
        fanDetails.function();
        fanDetails.types();
        fanDetails.powerSource();
        fanDetails.speedControl();
        fanDetails.energyConsumption();
        fanDetails.extraMethod();
        System.out.println("----------------------");

        FanCast fanCast = new FanCast();
        fanCast.cast(fanPoly);
    }
}
