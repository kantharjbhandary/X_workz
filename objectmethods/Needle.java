package objectmethods;

public class Needle {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 195;
    }
}
