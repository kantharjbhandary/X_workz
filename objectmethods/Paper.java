package objectmethods;

public class Paper {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 139;
    }
}
