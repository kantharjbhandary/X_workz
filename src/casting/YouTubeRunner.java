package casting;

public class YouTubeRunner {
    public static void main(String[] args) {

        YouTube youTube = new YouTube();
        youTube.contentType();
        youTube.users();
        youTube.monetization();
        youTube.quality();
        youTube.platform();
        System.out.println("----------------------");

        YouTube youTubePoly = new YouTubeDetails();
        youTubePoly.contentType();
        youTubePoly.users();
        youTubePoly.monetization();
        youTubePoly.quality();
        youTubePoly.platform();
        System.out.println("----------------------");

        YouTubeDetails youTubeDetails = new YouTubeDetails();
        youTubeDetails.contentType();
        youTubeDetails.users();
        youTubeDetails.monetization();
        youTubeDetails.quality();
        youTubeDetails.platform();
        youTubeDetails.extraMethod();
        System.out.println("----------------------");

        YouTubeCast youTubeCast = new YouTubeCast();
        youTubeCast.cast(youTubePoly);
    }
}
