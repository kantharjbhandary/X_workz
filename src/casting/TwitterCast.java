package casting;

public class TwitterCast {
    public void cast(Twitter twitter) {
        System.out.println("Casting Twitter");
        twitter.tweets();
        twitter.retweets();
        twitter.trending();
        twitter.followers();
        twitter.verification();
        if(twitter instanceof TwitterDetails) {
            TwitterDetails ref = (TwitterDetails)twitter;
            ref.extraMethod();
        }
    }
}
