package casting;

public class CoronaVirusRunner {
    public static void main(String[] args) {

        CoronaVirus coronaVirus = new CoronaVirus();
        coronaVirus.symptoms();
        coronaVirus.spread();
        coronaVirus.precautions();
        coronaVirus.vaccination();
        coronaVirus.globalImpact();
        System.out.println("----------------------");

        CoronaVirus coronaVirusPoly = new CoronaVirusDetails();
        coronaVirusPoly.symptoms();
        coronaVirusPoly.spread();
        coronaVirusPoly.precautions();
        coronaVirusPoly.vaccination();
        coronaVirusPoly.globalImpact();
        System.out.println("----------------------");

        CoronaVirusDetails coronaVirusDetails = new CoronaVirusDetails();
        coronaVirusDetails.symptoms();
        coronaVirusDetails.spread();
        coronaVirusDetails.precautions();
        coronaVirusDetails.vaccination();
        coronaVirusDetails.globalImpact();
        coronaVirusDetails.extraMethod();
        System.out.println("----------------------");

        CoronaVirusCast coronaVirusCast = new CoronaVirusCast();
        coronaVirusCast.cast(coronaVirusPoly);
    }
}
