package objectmethods;

public class Napkin {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 176;
    }
}
