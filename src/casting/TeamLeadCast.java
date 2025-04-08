package casting;

public class TeamLeadCast {
    public void cast(TeamLead teamLead) {
        System.out.println("Casting TeamLead");
        teamLead.leadership();
        teamLead.projectManagement();
        teamLead.communication();
        teamLead.problemSolving();
        teamLead.reporting();
        if(teamLead instanceof TeamLeadDetails) {
            TeamLeadDetails ref = (TeamLeadDetails)teamLead;
            ref.extraMethod();
        }
    }
}
