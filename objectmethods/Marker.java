package objectmethods;

public class Marker {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 108;
    }
}
