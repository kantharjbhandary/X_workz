package objectmethods;

public class Curtain {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 151;
    }
}
