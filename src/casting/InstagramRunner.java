package casting;

public class InstagramRunner {
    public static void main(String[] args) {

        Instagram instagram = new Instagram();
        instagram.posts();
        instagram.stories();
        instagram.reels();
        instagram.followers();
        instagram.filters();
        System.out.println("----------------------");

        Instagram instagramPoly = new InstagramDetails();
        instagramPoly.posts();
        instagramPoly.stories();
        instagramPoly.reels();
        instagramPoly.followers();
        instagramPoly.filters();
        System.out.println("----------------------");

        InstagramDetails instagramDetails = new InstagramDetails();
        instagramDetails.posts();
        instagramDetails.stories();
        instagramDetails.reels();
        instagramDetails.followers();
        instagramDetails.filters();
        instagramDetails.extraMethod();
        System.out.println("----------------------");

        InstagramCast instagramCast = new InstagramCast();
        instagramCast.cast(instagramPoly);
    }
}
