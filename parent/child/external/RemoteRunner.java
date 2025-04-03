package parent.child.external;

import parent.child.internal.Remote;
import parent.child.internal.SmartRemote;

public class RemoteRunner {

        public static void main(String[] args) {
            Remote remote = new Remote();
            remote.deviceCompatibility();
            remote.batteryType();
            remote.numberOfButtons();
            remote.wireless();
            remote.brand();

            System.out.println("-------------------------");

            SmartRemote smartRemote = new SmartRemote();
            smartRemote.deviceCompatibility();
            smartRemote.batteryType();
            smartRemote.numberOfButtons();
            smartRemote.wireless();
            smartRemote.brand();

            System.out.println("-------------------------");

            Remote remote1 = new SmartRemote();
            remote1.deviceCompatibility();
            remote1.batteryType();
            remote1.numberOfButtons();
            remote1.wireless();
            remote1.brand();
        }

}
