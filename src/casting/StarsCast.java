package casting;

public class StarsCast {
    public void cast(Stars stars) {
        System.out.println("Casting Stars");
        stars.brightness();
        stars.size();
        stars.composition();
        stars.lifecycle();
        stars.constellations();
        if(stars instanceof StarsDetails) {
            StarsDetails ref = (StarsDetails)stars;
            ref.extraMethod();
        }
    }
}
