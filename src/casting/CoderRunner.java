package casting;

public class CoderRunner {
    public static void main(String[] args) {

        Coder coder = new Coder();
        coder.programmingLanguages();
        coder.algorithms();
        coder.softwareDevelopment();
        coder.problemSolving();
        coder.learning();
        System.out.println("----------------------");

        Coder coderPoly = new CoderDetails();
        coderPoly.programmingLanguages();
        coderPoly.algorithms();
        coderPoly.softwareDevelopment();
        coderPoly.problemSolving();
        coderPoly.learning();
        System.out.println("----------------------");

        CoderDetails coderDetails = new CoderDetails();
        coderDetails.programmingLanguages();
        coderDetails.algorithms();
        coderDetails.softwareDevelopment();
        coderDetails.problemSolving();
        coderDetails.learning();
        coderDetails.extraMethod();
        System.out.println("----------------------");

        CoderCast coderCast = new CoderCast();
        coderCast.cast(coderPoly);
    }
}
