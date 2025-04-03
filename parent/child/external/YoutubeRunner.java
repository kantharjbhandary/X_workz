package parent.child.external;

import parent.child.internal.YouTube;
import parent.child.internal.YouTubeChannel;

public class YoutubeRunner {

        public static void main(String[] args) {
            YouTube youtube = new YouTube();
            youtube.contentType();
            youtube.users();
            youtube.monetization();
            youtube.quality();
            youtube.platform();

            System.out.println("-------------------------");

            YouTubeChannel youtubeChannel = new YouTubeChannel();
            youtubeChannel.contentType();
            youtubeChannel.users();
            youtubeChannel.monetization();
            youtubeChannel.quality();
            youtubeChannel.platform();

            System.out.println("-------------------------");

            YouTube youtube1 = new YouTubeChannel();
            youtube1.contentType();
            youtube1.users();
            youtube1.monetization();
            youtube1.quality();
            youtube1.platform();
        }
    }

