package casting;

public class ToothpasteCast {
    public void cast(Toothpaste toothpaste) {
        System.out.println("Casting Toothpaste");
        toothpaste.ingredients();
        toothpaste.flavor();
        toothpaste.brand();
        toothpaste.benefits();
        toothpaste.usage();
        if(toothpaste instanceof ToothpasteDetails) {
            ToothpasteDetails ref = (ToothpasteDetails)toothpaste;
            ref.extraMethod();
        }
    }
}
