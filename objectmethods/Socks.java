package objectmethods;

public class Socks {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 133;
    }
}
