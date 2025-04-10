package objectmethods;

public class Pencil {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 101;
    }
}
