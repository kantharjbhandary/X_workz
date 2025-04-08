package parent.child.utility;

import parent.child.internal.Chef;
import parent.child.internal.Cook;

public class MasterChef {
    public void masterofMasterchef(Cook cook)
    {
        cook.ingredients();
        cook.cuisine();
        cook.methods();
        cook.skills();
        cook.tools();
        if(cook instanceof Chef)
        {
            Chef chef=(Chef)cook;
            chef.cookThefood();
        }


    }
}
