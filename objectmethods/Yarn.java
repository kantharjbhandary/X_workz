package objectmethods;

public class Yarn {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 197;
    }
}
