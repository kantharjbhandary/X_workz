package objectmethods;

public class Switch {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 148;
    }
}
