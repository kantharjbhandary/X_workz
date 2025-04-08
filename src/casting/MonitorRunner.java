package casting;

public class MonitorRunner {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        monitor.resolution();
        monitor.size();
        monitor.refreshRate();
        monitor.panelType();
        monitor.usage();
        System.out.println("----------------------");

        Monitor monitorPoly = new MonitorDetails();
        monitorPoly.resolution();
        monitorPoly.size();
        monitorPoly.refreshRate();
        monitorPoly.panelType();
        monitorPoly.usage();
        System.out.println("----------------------");

        MonitorDetails monitorDetails = new MonitorDetails();
        monitorDetails.resolution();
        monitorDetails.size();
        monitorDetails.refreshRate();
        monitorDetails.panelType();
        monitorDetails.usage();
        monitorDetails.extraMethod();
        System.out.println("----------------------");

        MonitorCast monitorCast = new MonitorCast();
        monitorCast.cast(monitorPoly);
    }
}
