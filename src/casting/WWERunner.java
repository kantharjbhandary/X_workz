package casting;

public class WWERunner {
    public static void main(String[] args) {

        WWE wWE = new WWE();
        wWE.wrestlers();
        wWE.events();
        wWE.championships();
        wWE.audience();
        wWE.entertainment();
        System.out.println("----------------------");

        WWE wWEPoly = new WWEDetails();
        wWEPoly.wrestlers();
        wWEPoly.events();
        wWEPoly.championships();
        wWEPoly.audience();
        wWEPoly.entertainment();
        System.out.println("----------------------");

        WWEDetails wWEDetails = new WWEDetails();
        wWEDetails.wrestlers();
        wWEDetails.events();
        wWEDetails.championships();
        wWEDetails.audience();
        wWEDetails.entertainment();
        wWEDetails.extraMethod();
        System.out.println("----------------------");

        WWECast wWECast = new WWECast();
        wWECast.cast(wWEPoly);
    }
}
