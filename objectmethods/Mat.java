package objectmethods;

public class Mat {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 162;
    }
}
