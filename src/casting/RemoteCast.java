package casting;

public class RemoteCast {
    public void cast(Remote remote) {
        System.out.println("Casting Remote");
        remote.deviceCompatibility();
        remote.batteryType();
        remote.numberOfButtons();
        remote.wireless();
        remote.brand();
        if(remote instanceof RemoteDetails) {
            RemoteDetails ref = (RemoteDetails)remote;
            ref.extraMethod();
        }
    }
}
