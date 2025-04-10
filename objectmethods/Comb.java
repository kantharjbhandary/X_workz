package objectmethods;

public class Comb {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 126;
    }
}
