package objectmethods;

public class Scissors {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 141;
    }
}
