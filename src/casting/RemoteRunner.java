package casting;

public class RemoteRunner {
    public static void main(String[] args) {

        Remote remote = new Remote();
        remote.deviceCompatibility();
        remote.batteryType();
        remote.numberOfButtons();
        remote.wireless();
        remote.brand();
        System.out.println("----------------------");

        Remote remotePoly = new RemoteDetails();
        remotePoly.deviceCompatibility();
        remotePoly.batteryType();
        remotePoly.numberOfButtons();
        remotePoly.wireless();
        remotePoly.brand();
        System.out.println("----------------------");

        RemoteDetails remoteDetails = new RemoteDetails();
        remoteDetails.deviceCompatibility();
        remoteDetails.batteryType();
        remoteDetails.numberOfButtons();
        remoteDetails.wireless();
        remoteDetails.brand();
        remoteDetails.extraMethod();
        System.out.println("----------------------");

        RemoteCast remoteCast = new RemoteCast();
        remoteCast.cast(remotePoly);
    }
}
