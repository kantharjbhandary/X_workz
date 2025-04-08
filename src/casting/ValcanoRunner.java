package casting;

public class ValcanoRunner {
    public static void main(String[] args) {

        Valcano valcano = new Valcano();
        valcano.type();
        valcano.eruption();
        valcano.location();
        valcano.impact();
        valcano.monitoring();
        System.out.println("----------------------");

        Valcano valcanoPoly = new ValcanoDetails();
        valcanoPoly.type();
        valcanoPoly.eruption();
        valcanoPoly.location();
        valcanoPoly.impact();
        valcanoPoly.monitoring();
        System.out.println("----------------------");

        ValcanoDetails valcanoDetails = new ValcanoDetails();
        valcanoDetails.type();
        valcanoDetails.eruption();
        valcanoDetails.location();
        valcanoDetails.impact();
        valcanoDetails.monitoring();
        valcanoDetails.extraMethod();
        System.out.println("----------------------");

        ValcanoCast valcanoCast = new ValcanoCast();
        valcanoCast.cast(valcanoPoly);
    }
}
