package casting;

public class FaceBookDetails extends FaceBook {
    @Override
    public void features() {
        System.out.println("Overridden: features in FaceBookDetails");
    }

    @Override
    public void users() {
        System.out.println("Overridden: users in FaceBookDetails");
    }

    @Override
    public void privacy() {
        System.out.println("Overridden: privacy in FaceBookDetails");
    }

    @Override
    public void advertising() {
        System.out.println("Overridden: advertising in FaceBookDetails");
    }

    @Override
    public void communication() {
        System.out.println("Overridden: communication in FaceBookDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in FaceBookDetails");
    }
}
