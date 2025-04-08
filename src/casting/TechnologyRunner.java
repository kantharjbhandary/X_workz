package casting;

public class TechnologyRunner {
    public static void main(String[] args) {

        Technology technology = new Technology();
        technology.category();
        technology.impact();
        technology.evolution();
        technology.applications();
        technology.futureTrends();
        System.out.println("----------------------");

        Technology technologyPoly = new TechnologyDetails();
        technologyPoly.category();
        technologyPoly.impact();
        technologyPoly.evolution();
        technologyPoly.applications();
        technologyPoly.futureTrends();
        System.out.println("----------------------");

        TechnologyDetails technologyDetails = new TechnologyDetails();
        technologyDetails.category();
        technologyDetails.impact();
        technologyDetails.evolution();
        technologyDetails.applications();
        technologyDetails.futureTrends();
        technologyDetails.extraMethod();
        System.out.println("----------------------");

        TechnologyCast technologyCast = new TechnologyCast();
        technologyCast.cast(technologyPoly);
    }
}
