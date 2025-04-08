package casting;

public class GalaxyCast {
    public void cast(Galaxy galaxy) {
        System.out.println("Casting Galaxy");
        galaxy.composition();
        galaxy.types();
        galaxy.distance();
        galaxy.discovery();
        galaxy.size();
        if(galaxy instanceof GalaxyDetails) {
            GalaxyDetails ref = (GalaxyDetails)galaxy;
            ref.extraMethod();
        }
    }
}
