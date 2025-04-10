package objectmethods;

public class Light {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 117;
    }
}
