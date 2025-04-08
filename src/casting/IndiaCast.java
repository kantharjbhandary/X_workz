package casting;

public class IndiaCast {
    public void cast(India india) {
        System.out.println("Casting India");
        india.states();
        india.diversity();
        india.economy();
        india.history();
        india.festivals();
        if(india instanceof IndiaDetails) {
            IndiaDetails ref = (IndiaDetails)india;
            ref.extraMethod();
        }
    }
}
