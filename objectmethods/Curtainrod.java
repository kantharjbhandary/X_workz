package objectmethods;

public class Curtainrod {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 199;
    }
}
