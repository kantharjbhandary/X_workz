package casting;

public class InstagramCast {
    public void cast(Instagram instagram) {
        System.out.println("Casting Instagram");
        instagram.posts();
        instagram.stories();
        instagram.reels();
        instagram.followers();
        instagram.filters();
        if(instagram instanceof InstagramDetails) {
            InstagramDetails ref = (InstagramDetails)instagram;
            ref.extraMethod();
        }
    }
}
