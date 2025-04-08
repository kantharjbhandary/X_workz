package casting;

public class DeveloperCast {
    public void cast(Developer developer) {
        System.out.println("Casting Developer");
        developer.coding();
        developer.debugging();
        developer.testing();
        developer.collaboration();
        developer.deployment();
        if(developer instanceof DeveloperDetails) {
            DeveloperDetails ref = (DeveloperDetails)developer;
            ref.extraMethod();
        }
    }
}
