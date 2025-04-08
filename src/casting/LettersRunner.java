package casting;

public class LettersRunner {
    public static void main(String[] args) {

        Letters letters = new Letters();
        letters.communication();
        letters.types();
        letters.format();
        letters.medium();
        letters.importance();
        System.out.println("----------------------");

        Letters lettersPoly = new LettersDetails();
        lettersPoly.communication();
        lettersPoly.types();
        lettersPoly.format();
        lettersPoly.medium();
        lettersPoly.importance();
        System.out.println("----------------------");

        LettersDetails lettersDetails = new LettersDetails();
        lettersDetails.communication();
        lettersDetails.types();
        lettersDetails.format();
        lettersDetails.medium();
        lettersDetails.importance();
        lettersDetails.extraMethod();
        System.out.println("----------------------");

        LettersCast lettersCast = new LettersCast();
        lettersCast.cast(lettersPoly);
    }
}
