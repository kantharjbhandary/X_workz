package objectmethods;

public class Shoes {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 132;
    }
}
