package objectmethods;

public class Soap {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 155;
    }
}
