package objectmethods;

public class Beer {
    @Override
    public int hashCode() {
        System.out.println("the original hashcode is "+super.hashCode());
        return 890;
    }
}
