package parent.child.external;

import parent.child.internal.Twitter;
import parent.child.internal.TwitterProfile;

public class TwiterRunner {
        public static void main(String[] args) {
            Twitter twitter = new Twitter();
            twitter.tweets();
            twitter.retweets();
            twitter.trending();
            twitter.followers();
            twitter.verification();

            System.out.println("-------------------------");

            TwitterProfile twitterProfile = new TwitterProfile();
            twitterProfile.tweets();
            twitterProfile.retweets();
            twitterProfile.trending();
            twitterProfile.followers();
            twitterProfile.verification();

            System.out.println("-------------------------");

            Twitter twitter1 = new TwitterProfile();
            twitter1.tweets();
            twitter1.retweets();
            twitter1.trending();
            twitter1.followers();
            twitter1.verification();
        }

}
