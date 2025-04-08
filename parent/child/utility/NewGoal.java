package parent.child.utility;

import parent.child.internal.CareerGoals;
import parent.child.internal.Goal;

public class NewGoal {
    public void myGoals(Goal goal)
    {
        goal.achievement();
        goal.measurement();
        goal.motivation();
        goal.planning();
        goal.types();
        if(goal instanceof CareerGoals)
        {
            CareerGoals careerGoals=(CareerGoals)goal;
            careerGoals.utilityMethod();

        }
    }
}
