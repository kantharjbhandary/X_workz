package objectmethods;

public class Coffee {
    @Override
    public int hashCode() {
        System.out.println("the original hascode is "+super.hashCode());
        return 108;
    }
}
