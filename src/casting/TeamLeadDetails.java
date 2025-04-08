package casting;

public class TeamLeadDetails extends TeamLead {
    @Override
    public void leadership() {
        System.out.println("Overridden: leadership in TeamLeadDetails");
    }

    @Override
    public void projectManagement() {
        System.out.println("Overridden: projectManagement in TeamLeadDetails");
    }

    @Override
    public void communication() {
        System.out.println("Overridden: communication in TeamLeadDetails");
    }

    @Override
    public void problemSolving() {
        System.out.println("Overridden: problemSolving in TeamLeadDetails");
    }

    @Override
    public void reporting() {
        System.out.println("Overridden: reporting in TeamLeadDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TeamLeadDetails");
    }
}
