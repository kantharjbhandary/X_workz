package casting;

public class TwitterDetails extends Twitter {
    @Override
    public void tweets() {
        System.out.println("Overridden: tweets in TwitterDetails");
    }

    @Override
    public void retweets() {
        System.out.println("Overridden: retweets in TwitterDetails");
    }

    @Override
    public void trending() {
        System.out.println("Overridden: trending in TwitterDetails");
    }

    @Override
    public void followers() {
        System.out.println("Overridden: followers in TwitterDetails");
    }

    @Override
    public void verification() {
        System.out.println("Overridden: verification in TwitterDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TwitterDetails");
    }
}
