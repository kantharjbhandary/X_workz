package objectmethods;

public class Speaker {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 144;
    }
}
