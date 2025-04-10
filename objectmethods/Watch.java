package objectmethods;

public class Watch {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 129;
    }
}
