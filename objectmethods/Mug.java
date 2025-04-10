package objectmethods;

public class Mug {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 128;
    }
}
