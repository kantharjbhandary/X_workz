package objectmethods;

public class Microwave {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 172;
    }
}
