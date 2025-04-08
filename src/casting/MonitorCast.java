package casting;

public class MonitorCast {
    public void cast(Monitor monitor) {
        System.out.println("Casting Monitor");
        monitor.resolution();
        monitor.size();
        monitor.refreshRate();
        monitor.panelType();
        monitor.usage();
        if(monitor instanceof MonitorDetails) {
            MonitorDetails ref = (MonitorDetails)monitor;
            ref.extraMethod();
        }
    }
}
