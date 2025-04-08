package casting;

public class GalaxyRunner {
    public static void main(String[] args) {

        Galaxy galaxy = new Galaxy();
        galaxy.composition();
        galaxy.types();
        galaxy.distance();
        galaxy.discovery();
        galaxy.size();
        System.out.println("----------------------");

        Galaxy galaxyPoly = new GalaxyDetails();
        galaxyPoly.composition();
        galaxyPoly.types();
        galaxyPoly.distance();
        galaxyPoly.discovery();
        galaxyPoly.size();
        System.out.println("----------------------");

        GalaxyDetails galaxyDetails = new GalaxyDetails();
        galaxyDetails.composition();
        galaxyDetails.types();
        galaxyDetails.distance();
        galaxyDetails.discovery();
        galaxyDetails.size();
        galaxyDetails.extraMethod();
        System.out.println("----------------------");

        GalaxyCast galaxyCast = new GalaxyCast();
        galaxyCast.cast(galaxyPoly);
    }
}
