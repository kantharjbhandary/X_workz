package casting;

public class TechnologyCast {
    public void cast(Technology technology) {
        System.out.println("Casting Technology");
        technology.category();
        technology.impact();
        technology.evolution();
        technology.applications();
        technology.futureTrends();
        if(technology instanceof TechnologyDetails) {
            TechnologyDetails ref = (TechnologyDetails)technology;
            ref.extraMethod();
        }
    }
}
