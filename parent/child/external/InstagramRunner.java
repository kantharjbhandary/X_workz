package parent.child.external;

import parent.child.internal.Instagram;
import parent.child.internal.InstagramAccount;

public class InstagramRunner {
        public static void main(String[] args) {
            Instagram instagram = new Instagram();
            instagram.posts();
            instagram.stories();
            instagram.reels();
            instagram.followers();
            instagram.filters();

            System.out.println("-------------------------");

            InstagramAccount instagramAccount = new InstagramAccount();
            instagramAccount.posts();
            instagramAccount.stories();
            instagramAccount.reels();
            instagramAccount.followers();
            instagramAccount.filters();

            System.out.println("-------------------------");

            Instagram instagram1 = new InstagramAccount();
            instagram1.posts();
            instagram1.stories();
            instagram1.reels();
            instagram1.followers();
            instagram1.filters();
        }
    }

