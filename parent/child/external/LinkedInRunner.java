package parent.child.external;

import parent.child.internal.LinkedIn;
import parent.child.internal.LinkedInProfile;

public class LinkedInRunner {

        public static void main(String[] args) {
            LinkedIn linkedIn = new LinkedIn();
            linkedIn.connections();
            linkedIn.jobs();
            linkedIn.articles();
            linkedIn.endorsements();
            linkedIn.messages();

            System.out.println("-------------------------");

            LinkedInProfile linkedInProfile = new LinkedInProfile();
            linkedInProfile.connections();
            linkedInProfile.jobs();
            linkedInProfile.articles();
            linkedInProfile.endorsements();
            linkedInProfile.messages();

            System.out.println("-------------------------");

            LinkedIn linkedIn1 = new LinkedInProfile();
            linkedIn1.connections();
            linkedIn1.jobs();
            linkedIn1.articles();
            linkedIn1.endorsements();
            linkedIn1.messages();
        }
}
