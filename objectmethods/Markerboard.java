package objectmethods;

public class Markerboard {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 180;
    }
}
