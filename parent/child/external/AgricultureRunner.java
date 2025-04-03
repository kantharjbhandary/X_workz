package parent.child.external;

import parent.child.internal.Agriculture;
import parent.child.internal.OrganicFarming;

public class AgricultureRunner {
    public static void main(String[] args) {
        Agriculture agriculture = new Agriculture();
        agriculture.crops();
        agriculture.irrigation();
        agriculture.machinery();
        agriculture.fertilizers();
        agriculture.economy();

        System.out.println("-------------------------");


        OrganicFarming organicFarming = new OrganicFarming();
        organicFarming.crops();
        organicFarming.irrigation();
        organicFarming.machinery();
        organicFarming.fertilizers();
        organicFarming.economy();

        System.out.println("-------------------------");


        Agriculture agriculture1 = new OrganicFarming();
        agriculture1.crops();
        agriculture1.irrigation();
        agriculture1.machinery();
        agriculture1.fertilizers();
        agriculture1.economy();
    }
}
