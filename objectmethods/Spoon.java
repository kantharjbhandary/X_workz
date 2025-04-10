package objectmethods;

public class Spoon {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 120;
    }
}
