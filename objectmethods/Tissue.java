package objectmethods;

public class Tissue {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 175;
    }
}
