package objectmethods;

public class Fork {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 121;
    }
}
