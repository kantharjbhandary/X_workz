package casting;

public class CoronaVirusDetails extends CoronaVirus {
    @Override
    public void symptoms() {
        System.out.println("Overridden: symptoms in CoronaVirusDetails");
    }

    @Override
    public void spread() {
        System.out.println("Overridden: spread in CoronaVirusDetails");
    }

    @Override
    public void precautions() {
        System.out.println("Overridden: precautions in CoronaVirusDetails");
    }

    @Override
    public void vaccination() {
        System.out.println("Overridden: vaccination in CoronaVirusDetails");
    }

    @Override
    public void globalImpact() {
        System.out.println("Overridden: globalImpact in CoronaVirusDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CoronaVirusDetails");
    }
}
