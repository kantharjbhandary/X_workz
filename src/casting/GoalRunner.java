package casting;

public class GoalRunner {
    public static void main(String[] args) {

        Goal goal = new Goal();
        goal.motivation();
        goal.achievement();
        goal.planning();
        goal.types();
        goal.measurement();
        System.out.println("----------------------");

        Goal goalPoly = new GoalDetails();
        goalPoly.motivation();
        goalPoly.achievement();
        goalPoly.planning();
        goalPoly.types();
        goalPoly.measurement();
        System.out.println("----------------------");

        GoalDetails goalDetails = new GoalDetails();
        goalDetails.motivation();
        goalDetails.achievement();
        goalDetails.planning();
        goalDetails.types();
        goalDetails.measurement();
        goalDetails.extraMethod();
        System.out.println("----------------------");

        GoalCast goalCast = new GoalCast();
        goalCast.cast(goalPoly);
    }
}
