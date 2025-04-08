package casting;

public class SportDetails extends Sport {
    @Override
    public void skillAndStrategy() {
        System.out.println("Overridden: skillAndStrategy in SportDetails");
    }

    @Override
    public void trainingAndPractice() {
        System.out.println("Overridden: trainingAndPractice in SportDetails");
    }

    @Override
    public void scoringSystem() {
        System.out.println("Overridden: scoringSystem in SportDetails");
    }

    @Override
    public void sportsmanship() {
        System.out.println("Overridden: sportsmanship in SportDetails");
    }

    @Override
    public void entertainmentValue() {
        System.out.println("Overridden: entertainmentValue in SportDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SportDetails");
    }
}
