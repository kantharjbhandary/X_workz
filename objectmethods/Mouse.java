package objectmethods;

public class Mouse {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 113;
    }
}
