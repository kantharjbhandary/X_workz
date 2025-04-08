package casting;

public class CampfireCast {
    public void cast(Campfire campfire) {
        System.out.println("Casting Campfire");
        campfire.fuelType();
        campfire.purpose();
        campfire.safety();
        campfire.duration();
        campfire.location();
        if(campfire instanceof CampfireDetails) {
            CampfireDetails ref = (CampfireDetails)campfire;
            ref.extraMethod();
        }
    }
}
