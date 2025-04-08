package casting;

public class GoalCast {
    public void cast(Goal goal) {
        System.out.println("Casting Goal");
        goal.motivation();
        goal.achievement();
        goal.planning();
        goal.types();
        goal.measurement();
        if(goal instanceof GoalDetails) {
            GoalDetails ref = (GoalDetails)goal;
            ref.extraMethod();
        }
    }
}
