package objectmethods;

public class Toolbox {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 190;
    }
}
