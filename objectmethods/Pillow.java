package objectmethods;

public class Pillow {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 152;
    }
}
