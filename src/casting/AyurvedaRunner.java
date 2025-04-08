package casting;

public class AyurvedaRunner {
    public static void main(String[] args) {

        Ayurveda ayurveda = new Ayurveda();
        ayurveda.origin();
        ayurveda.treatments();
        ayurveda.principles();
        ayurveda.therapies();
        ayurveda.globalReach();
        System.out.println("----------------------");

        Ayurveda ayurvedaPoly = new AyurvedaDetails();
        ayurvedaPoly.origin();
        ayurvedaPoly.treatments();
        ayurvedaPoly.principles();
        ayurvedaPoly.therapies();
        ayurvedaPoly.globalReach();
        System.out.println("----------------------");

        AyurvedaDetails ayurvedaDetails = new AyurvedaDetails();
        ayurvedaDetails.origin();
        ayurvedaDetails.treatments();
        ayurvedaDetails.principles();
        ayurvedaDetails.therapies();
        ayurvedaDetails.globalReach();
        ayurvedaDetails.extraMethod();
        System.out.println("----------------------");

        AyurvedaCast ayurvedaCast = new AyurvedaCast();
        ayurvedaCast.cast(ayurvedaPoly);
    }
}
