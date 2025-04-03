package parent.child.external;

import parent.child.internal.TeamLead;
import parent.child.internal.TechLead;

public class TeamLeadRunne{
public static void main(String[] args) {
            TeamLead teamLead = new TeamLead();
            teamLead.leadership();
            teamLead.projectManagement();
            teamLead.communication();
            teamLead.problemSolving();
            teamLead.reporting();

            System.out.println("-------------------------");

            TechLead techLead = new TechLead();
            techLead.leadership();
            techLead.projectManagement();
            techLead.communication();
            techLead.problemSolving();
            techLead.reporting();

            System.out.println("-------------------------");

            TeamLead teamLead1 = new TechLead();
            teamLead1.leadership();
            teamLead1.projectManagement();
            teamLead1.communication();
            teamLead1.problemSolving();
            teamLead1.reporting();
        }
    }

