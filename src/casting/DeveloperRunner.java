package casting;

public class DeveloperRunner {
    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.coding();
        developer.debugging();
        developer.testing();
        developer.collaboration();
        developer.deployment();
        System.out.println("----------------------");

        Developer developerPoly = new DeveloperDetails();
        developerPoly.coding();
        developerPoly.debugging();
        developerPoly.testing();
        developerPoly.collaboration();
        developerPoly.deployment();
        System.out.println("----------------------");

        DeveloperDetails developerDetails = new DeveloperDetails();
        developerDetails.coding();
        developerDetails.debugging();
        developerDetails.testing();
        developerDetails.collaboration();
        developerDetails.deployment();
        developerDetails.extraMethod();
        System.out.println("----------------------");

        DeveloperCast developerCast = new DeveloperCast();
        developerCast.cast(developerPoly);
    }
}
