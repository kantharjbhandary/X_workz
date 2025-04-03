package parent.child.external;

import parent.child.internal.CareerGoals;
import parent.child.internal.Goal;

public class GoalRunner {
        public static void main(String[] args) {
            Goal goal = new Goal();
            goal.motivation();
            goal.achievement();
            goal.planning();
            goal.types();
            goal.measurement();

            System.out.println("-------------------------");

            CareerGoals careerGoals = new CareerGoals();
            careerGoals.motivation();
            careerGoals.achievement();
            careerGoals.planning();
            careerGoals.types();
            careerGoals.measurement();

            System.out.println("-------------------------");

            Goal goal1 = new CareerGoals();
            goal1.motivation();
            goal1.achievement();
            goal1.planning();
            goal1.types();
            goal1.measurement();
        }

}
