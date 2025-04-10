package objectmethods;

public class Paperclip {


    @Override
    public int hashCode() {
        System.out.println("the original hashcode is " + super.hashCode());
        return 185;
    }
}
