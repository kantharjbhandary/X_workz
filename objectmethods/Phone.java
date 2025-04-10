package objectmethods;

public class Phone {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 110;
    }
}
