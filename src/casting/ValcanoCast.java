package casting;

public class ValcanoCast {
    public void cast(Valcano valcano) {
        System.out.println("Casting Valcano");
        valcano.type();
        valcano.eruption();
        valcano.location();
        valcano.impact();
        valcano.monitoring();
        if(valcano instanceof ValcanoDetails) {
            ValcanoDetails ref = (ValcanoDetails)valcano;
            ref.extraMethod();
        }
    }
}
