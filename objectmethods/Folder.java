package objectmethods;

public class Folder {

    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 186;
    }
}
