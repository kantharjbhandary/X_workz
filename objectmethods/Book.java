package objectmethods;

public class Book {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 138;
    }
}
