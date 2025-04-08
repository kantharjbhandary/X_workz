package casting;

public class SportRunner {
    public static void main(String[] args) {

        Sport sport = new Sport();
        sport.skillAndStrategy();
        sport.trainingAndPractice();
        sport.scoringSystem();
        sport.sportsmanship();
        sport.entertainmentValue();
        System.out.println("----------------------");

        Sport sportPoly = new SportDetails();
        sportPoly.skillAndStrategy();
        sportPoly.trainingAndPractice();
        sportPoly.scoringSystem();
        sportPoly.sportsmanship();
        sportPoly.entertainmentValue();
        System.out.println("----------------------");

        SportDetails sportDetails = new SportDetails();
        sportDetails.skillAndStrategy();
        sportDetails.trainingAndPractice();
        sportDetails.scoringSystem();
        sportDetails.sportsmanship();
        sportDetails.entertainmentValue();
        sportDetails.extraMethod();
        System.out.println("----------------------");

        SportCast sportCast = new SportCast();
        sportCast.cast(sportPoly);
    }
}
