package objectmethods;

public class Thread {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 196;
    }
}
