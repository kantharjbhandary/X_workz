package objectmethods;

public class Grater {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 168;
    }
}
