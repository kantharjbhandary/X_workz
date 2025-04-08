package casting;

public class BraceletCast {
    public void cast(Bracelet bracelet) {
        System.out.println("Casting Bracelet");
        bracelet.material();
        bracelet.design();
        bracelet.usage();
        bracelet.history();
        bracelet.price();
        if(bracelet instanceof BraceletDetails) {
            BraceletDetails ref = (BraceletDetails)bracelet;
            ref.extraMethod();
        }
    }
}
