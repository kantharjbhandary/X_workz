package objectmethods;

public class Envelope {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 187;
    }
}
