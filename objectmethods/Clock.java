package objectmethods;

public class Clock {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 130;
    }
}
