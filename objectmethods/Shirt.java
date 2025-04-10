package objectmethods;

public class Shirt {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 134;
    }
}
