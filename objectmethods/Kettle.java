package objectmethods;

public class Kettle {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 165;
    }
}
