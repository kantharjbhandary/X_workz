package casting;

public class SportCast {
    public void cast(Sport sport) {
        System.out.println("Casting Sport");
        sport.skillAndStrategy();
        sport.trainingAndPractice();
        sport.scoringSystem();
        sport.sportsmanship();
        sport.entertainmentValue();
        if(sport instanceof SportDetails) {
            SportDetails ref = (SportDetails)sport;
            ref.extraMethod();
        }
    }
}
