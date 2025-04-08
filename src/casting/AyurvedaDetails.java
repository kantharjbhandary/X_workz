package casting;

public class AyurvedaDetails extends Ayurveda {
    @Override
    public void origin() {
        System.out.println("Overridden: origin in AyurvedaDetails");
    }

    @Override
    public void treatments() {
        System.out.println("Overridden: treatments in AyurvedaDetails");
    }

    @Override
    public void principles() {
        System.out.println("Overridden: principles in AyurvedaDetails");
    }

    @Override
    public void therapies() {
        System.out.println("Overridden: therapies in AyurvedaDetails");
    }

    @Override
    public void globalReach() {
        System.out.println("Overridden: globalReach in AyurvedaDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in AyurvedaDetails");
    }
}
