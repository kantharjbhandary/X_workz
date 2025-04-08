package casting;

public class AgricultureCast {
    public void cast(Agriculture agriculture) {
        System.out.println("Casting Agriculture");
        agriculture.crops();
        agriculture.irrigation();
        agriculture.machinery();
        agriculture.fertilizers();
        agriculture.economy();
        if(agriculture instanceof AgricultureDetails) {
            AgricultureDetails ref = (AgricultureDetails)agriculture;
            ref.extraMethod();
        }
    }
}
