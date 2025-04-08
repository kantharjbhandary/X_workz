package casting;

public class YouTubeCast {
    public void cast(YouTube youTube) {
        System.out.println("Casting YouTube");
        youTube.contentType();
        youTube.users();
        youTube.monetization();
        youTube.quality();
        youTube.platform();
        if(youTube instanceof YouTubeDetails) {
            YouTubeDetails ref = (YouTubeDetails)youTube;
            ref.extraMethod();
        }
    }
}
