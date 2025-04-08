package casting;

public class CoderCast {
    public void cast(Coder coder) {
        System.out.println("Casting Coder");
        coder.programmingLanguages();
        coder.algorithms();
        coder.softwareDevelopment();
        coder.problemSolving();
        coder.learning();
        if(coder instanceof CoderDetails) {
            CoderDetails ref = (CoderDetails)coder;
            ref.extraMethod();
        }
    }
}
