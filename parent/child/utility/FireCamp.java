package parent.child.utility;

import parent.child.internal.Bonfire;
import parent.child.internal.Campfire;

public class FireCamp {

    public void runfire(Campfire campfire)  {
        campfire.safety();
        campfire.duration();
        campfire.fuelType();
        campfire.purpose();
        campfire.location();
        if(campfire instanceof Bonfire)
        {
            Bonfire bonfire=(Bonfire)campfire;
            bonfire.firing();

        }

    }

}

