package casting;

public class SnapchatRunner {
    public static void main(String[] args) {

        Snapchat snapchat = new Snapchat();
        snapchat.snaps();
        snapchat.stories();
        snapchat.filters();
        snapchat.chat();
        snapchat.spotlight();
        System.out.println("----------------------");

        Snapchat snapchatPoly = new SnapchatDetails();
        snapchatPoly.snaps();
        snapchatPoly.stories();
        snapchatPoly.filters();
        snapchatPoly.chat();
        snapchatPoly.spotlight();
        System.out.println("----------------------");

        SnapchatDetails snapchatDetails = new SnapchatDetails();
        snapchatDetails.snaps();
        snapchatDetails.stories();
        snapchatDetails.filters();
        snapchatDetails.chat();
        snapchatDetails.spotlight();
        snapchatDetails.extraMethod();
        System.out.println("----------------------");

        SnapchatCast snapchatCast = new SnapchatCast();
        snapchatCast.cast(snapchatPoly);
    }
}
