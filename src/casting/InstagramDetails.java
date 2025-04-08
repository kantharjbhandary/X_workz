package casting;

public class InstagramDetails extends Instagram {
    @Override
    public void posts() {
        System.out.println("Overridden: posts in InstagramDetails");
    }

    @Override
    public void stories() {
        System.out.println("Overridden: stories in InstagramDetails");
    }

    @Override
    public void reels() {
        System.out.println("Overridden: reels in InstagramDetails");
    }

    @Override
    public void followers() {
        System.out.println("Overridden: followers in InstagramDetails");
    }

    @Override
    public void filters() {
        System.out.println("Overridden: filters in InstagramDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in InstagramDetails");
    }
}
