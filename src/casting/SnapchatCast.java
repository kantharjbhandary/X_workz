package casting;

public class SnapchatCast {
    public void cast(Snapchat snapchat) {
        System.out.println("Casting Snapchat");
        snapchat.snaps();
        snapchat.stories();
        snapchat.filters();
        snapchat.chat();
        snapchat.spotlight();
        if(snapchat instanceof SnapchatDetails) {
            SnapchatDetails ref = (SnapchatDetails)snapchat;
            ref.extraMethod();
        }
    }
}
