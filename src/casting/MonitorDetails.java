package casting;

public class MonitorDetails extends Monitor {
    @Override
    public void resolution() {
        System.out.println("Overridden: resolution in MonitorDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in MonitorDetails");
    }

    @Override
    public void refreshRate() {
        System.out.println("Overridden: refreshRate in MonitorDetails");
    }

    @Override
    public void panelType() {
        System.out.println("Overridden: panelType in MonitorDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in MonitorDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MonitorDetails");
    }
}
