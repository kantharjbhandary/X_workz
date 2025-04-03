package parent.child.external;

import parent.child.internal.FaceBook;
import parent.child.internal.FacebookPage;

public class FaceBookRunner {

    public static void main(String[] args) {
        FaceBook facebook = new FaceBook();
        facebook.features();
        facebook.users();
        facebook.privacy();
        facebook.advertising();
        facebook.communication();

        System.out.println("-------------------------");

        FacebookPage facebookPage = new FacebookPage();
        facebookPage.features();
        facebookPage.users();
        facebookPage.privacy();
        facebookPage.advertising();
        facebookPage.communication();

        System.out.println("-------------------------");

        FaceBook facebook1 = new FacebookPage();
        facebook1.features();
        facebook1.users();
        facebook1.privacy();
        facebook1.advertising();
        facebook1.communication();

    }
}