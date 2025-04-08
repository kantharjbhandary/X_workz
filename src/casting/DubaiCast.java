package casting;

public class DubaiCast {
    public void cast(Dubai dubai) {
        System.out.println("Casting Dubai");
        dubai.tourism();
        dubai.economy();
        dubai.architecture();
        dubai.climate();
        dubai.culture();
        if(dubai instanceof DubaiDetails) {
            DubaiDetails ref = (DubaiDetails)dubai;
            ref.extraMethod();
        }
    }
}
