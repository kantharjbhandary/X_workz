package objectmethods;

public class Monitor {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 115;
    }
}
