package objectmethods;

public class Plate {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 119;
    }
}
