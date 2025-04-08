package casting;

public class WWECast {
    public void cast(WWE wWE) {
        System.out.println("Casting WWE");
        wWE.wrestlers();
        wWE.events();
        wWE.championships();
        wWE.audience();
        wWE.entertainment();
        if(wWE instanceof WWEDetails) {
            WWEDetails ref = (WWEDetails)wWE;
            ref.extraMethod();
        }
    }
}
