package casting;

public class CampfireRunner {
    public static void main(String[] args) {

        Campfire campfire = new Campfire();
        campfire.fuelType();
        campfire.purpose();
        campfire.safety();
        campfire.duration();
        campfire.location();
        System.out.println("----------------------");

        Campfire campfirePoly = new CampfireDetails();
        campfirePoly.fuelType();
        campfirePoly.purpose();
        campfirePoly.safety();
        campfirePoly.duration();
        campfirePoly.location();
        System.out.println("----------------------");

        CampfireDetails campfireDetails = new CampfireDetails();
        campfireDetails.fuelType();
        campfireDetails.purpose();
        campfireDetails.safety();
        campfireDetails.duration();
        campfireDetails.location();
        campfireDetails.extraMethod();
        System.out.println("----------------------");

        CampfireCast campfireCast = new CampfireCast();
        campfireCast.cast(campfirePoly);
    }
}
