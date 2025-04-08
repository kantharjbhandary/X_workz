package casting;

public class AgricultureRunner {
    public static void main(String[] args) {

        Agriculture agriculture = new Agriculture();
        agriculture.crops();
        agriculture.irrigation();
        agriculture.machinery();
        agriculture.fertilizers();
        agriculture.economy();
        System.out.println("----------------------");

        Agriculture agriculturePoly = new AgricultureDetails();
        agriculturePoly.crops();
        agriculturePoly.irrigation();
        agriculturePoly.machinery();
        agriculturePoly.fertilizers();
        agriculturePoly.economy();
        System.out.println("----------------------");

        AgricultureDetails agricultureDetails = new AgricultureDetails();
        agricultureDetails.crops();
        agricultureDetails.irrigation();
        agricultureDetails.machinery();
        agricultureDetails.fertilizers();
        agricultureDetails.economy();
        agricultureDetails.extraMethod();
        System.out.println("----------------------");

        AgricultureCast agricultureCast = new AgricultureCast();
        agricultureCast.cast(agriculturePoly);
    }
}
