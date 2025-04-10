package objectmethods;

public class Board {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 179;
    }
}
