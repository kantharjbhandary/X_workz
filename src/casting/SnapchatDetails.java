package casting;

public class SnapchatDetails extends Snapchat {
    @Override
    public void snaps() {
        System.out.println("Overridden: snaps in SnapchatDetails");
    }

    @Override
    public void stories() {
        System.out.println("Overridden: stories in SnapchatDetails");
    }

    @Override
    public void filters() {
        System.out.println("Overridden: filters in SnapchatDetails");
    }

    @Override
    public void chat() {
        System.out.println("Overridden: chat in SnapchatDetails");
    }

    @Override
    public void spotlight() {
        System.out.println("Overridden: spotlight in SnapchatDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SnapchatDetails");
    }
}
