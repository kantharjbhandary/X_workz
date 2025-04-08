package casting;

public class TwitterRunner {
    public static void main(String[] args) {

        Twitter twitter = new Twitter();
        twitter.tweets();
        twitter.retweets();
        twitter.trending();
        twitter.followers();
        twitter.verification();
        System.out.println("----------------------");

        Twitter twitterPoly = new TwitterDetails();
        twitterPoly.tweets();
        twitterPoly.retweets();
        twitterPoly.trending();
        twitterPoly.followers();
        twitterPoly.verification();
        System.out.println("----------------------");

        TwitterDetails twitterDetails = new TwitterDetails();
        twitterDetails.tweets();
        twitterDetails.retweets();
        twitterDetails.trending();
        twitterDetails.followers();
        twitterDetails.verification();
        twitterDetails.extraMethod();
        System.out.println("----------------------");

        TwitterCast twitterCast = new TwitterCast();
        twitterCast.cast(twitterPoly);
    }
}
