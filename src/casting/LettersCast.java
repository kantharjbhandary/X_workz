package casting;

public class LettersCast {
    public void cast(Letters letters) {
        System.out.println("Casting Letters");
        letters.communication();
        letters.types();
        letters.format();
        letters.medium();
        letters.importance();
        if(letters instanceof LettersDetails) {
            LettersDetails ref = (LettersDetails)letters;
            ref.extraMethod();
        }
    }
}
