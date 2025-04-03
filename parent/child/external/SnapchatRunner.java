package parent.child.external;

import parent.child.internal.Snapchat;
import parent.child.internal.SnapchatProfile;

public class SnapchatRunner {

        public static void main(String[] args) {
            Snapchat snapchat = new Snapchat();
            snapchat.snaps();
            snapchat.stories();
            snapchat.filters();
            snapchat.chat();
            snapchat.spotlight();

            System.out.println("-------------------------");

            SnapchatProfile snapchatProfile = new SnapchatProfile();
            snapchatProfile.snaps();
            snapchatProfile.stories();
            snapchatProfile.filters();
            snapchatProfile.chat();
            snapchatProfile.spotlight();

            System.out.println("-------------------------");

            Snapchat snapchat1 = new SnapchatProfile();
            snapchat1.snaps();
            snapchat1.stories();
            snapchat1.filters();
            snapchat1.chat();
            snapchat1.spotlight();
        }
    }

