package casting;

public class ToothpasteRunner {
    public static void main(String[] args) {

        Toothpaste toothpaste = new Toothpaste();
        toothpaste.ingredients();
        toothpaste.flavor();
        toothpaste.brand();
        toothpaste.benefits();
        toothpaste.usage();
        System.out.println("----------------------");

        Toothpaste toothpastePoly = new ToothpasteDetails();
        toothpastePoly.ingredients();
        toothpastePoly.flavor();
        toothpastePoly.brand();
        toothpastePoly.benefits();
        toothpastePoly.usage();
        System.out.println("----------------------");

        ToothpasteDetails toothpasteDetails = new ToothpasteDetails();
        toothpasteDetails.ingredients();
        toothpasteDetails.flavor();
        toothpasteDetails.brand();
        toothpasteDetails.benefits();
        toothpasteDetails.usage();
        toothpasteDetails.extraMethod();
        System.out.println("----------------------");

        ToothpasteCast toothpasteCast = new ToothpasteCast();
        toothpasteCast.cast(toothpastePoly);
    }
}
