package casting;

public class TeamLeadRunner {
    public static void main(String[] args) {

        TeamLead teamLead = new TeamLead();
        teamLead.leadership();
        teamLead.projectManagement();
        teamLead.communication();
        teamLead.problemSolving();
        teamLead.reporting();
        System.out.println("----------------------");

        TeamLead teamLeadPoly = new TeamLeadDetails();
        teamLeadPoly.leadership();
        teamLeadPoly.projectManagement();
        teamLeadPoly.communication();
        teamLeadPoly.problemSolving();
        teamLeadPoly.reporting();
        System.out.println("----------------------");

        TeamLeadDetails teamLeadDetails = new TeamLeadDetails();
        teamLeadDetails.leadership();
        teamLeadDetails.projectManagement();
        teamLeadDetails.communication();
        teamLeadDetails.problemSolving();
        teamLeadDetails.reporting();
        teamLeadDetails.extraMethod();
        System.out.println("----------------------");

        TeamLeadCast teamLeadCast = new TeamLeadCast();
        teamLeadCast.cast(teamLeadPoly);
    }
}
