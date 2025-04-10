package objectmethods;

public class Bucket {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 127;
    }
}
