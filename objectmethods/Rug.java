package objectmethods;

public class Rug {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 161;
    }
}
