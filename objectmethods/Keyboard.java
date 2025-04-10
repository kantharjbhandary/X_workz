package objectmethods;

public class Keyboard {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 114;
    }
}
