package casting;

public class YouTubeDetails extends YouTube {
    @Override
    public void contentType() {
        System.out.println("Overridden: contentType in YouTubeDetails");
    }

    @Override
    public void users() {
        System.out.println("Overridden: users in YouTubeDetails");
    }

    @Override
    public void monetization() {
        System.out.println("Overridden: monetization in YouTubeDetails");
    }

    @Override
    public void quality() {
        System.out.println("Overridden: quality in YouTubeDetails");
    }

    @Override
    public void platform() {
        System.out.println("Overridden: platform in YouTubeDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in YouTubeDetails");
    }
}
