package objectmethods;

public class Pot {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 167;
    }
}
