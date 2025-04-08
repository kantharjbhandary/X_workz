package casting;

public class AyurvedaCast {
    public void cast(Ayurveda ayurveda) {
        System.out.println("Casting Ayurveda");
        ayurveda.origin();
        ayurveda.treatments();
        ayurveda.principles();
        ayurveda.therapies();
        ayurveda.globalReach();
        if(ayurveda instanceof AyurvedaDetails) {
            AyurvedaDetails ref = (AyurvedaDetails)ayurveda;
            ref.extraMethod();
        }
    }
}
