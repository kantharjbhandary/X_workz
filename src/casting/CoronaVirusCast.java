package casting;

public class CoronaVirusCast {
    public void cast(CoronaVirus coronaVirus) {
        System.out.println("Casting CoronaVirus");
        coronaVirus.symptoms();
        coronaVirus.spread();
        coronaVirus.precautions();
        coronaVirus.vaccination();
        coronaVirus.globalImpact();
        if(coronaVirus instanceof CoronaVirusDetails) {
            CoronaVirusDetails ref = (CoronaVirusDetails)coronaVirus;
            ref.extraMethod();
        }
    }
}
