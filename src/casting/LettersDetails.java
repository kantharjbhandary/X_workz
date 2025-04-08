package casting;

public class LettersDetails extends Letters {
    @Override
    public void communication() {
        System.out.println("Overridden: communication in LettersDetails");
    }

    @Override
    public void types() {
        System.out.println("Overridden: types in LettersDetails");
    }

    @Override
    public void format() {
        System.out.println("Overridden: format in LettersDetails");
    }

    @Override
    public void medium() {
        System.out.println("Overridden: medium in LettersDetails");
    }

    @Override
    public void importance() {
        System.out.println("Overridden: importance in LettersDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in LettersDetails");
    }
}
