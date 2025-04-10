package objectmethods;

public class Table {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 106;
    }
}
