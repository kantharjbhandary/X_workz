package objectmethods;

public class Mattress {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 154;
    }
}
