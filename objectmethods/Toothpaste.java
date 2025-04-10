package objectmethods;

public class Toothpaste {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 157;
    }
}
