package objectmethods;

public class Brush {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 125;
    }
}
