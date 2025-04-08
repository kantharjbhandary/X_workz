package casting;

public class LinkedInCast {
    public void cast(LinkedIn linkedIn) {
        System.out.println("Casting LinkedIn");
        linkedIn.connections();
        linkedIn.jobs();
        linkedIn.articles();
        linkedIn.endorsements();
        linkedIn.messages();
        if(linkedIn instanceof LinkedInDetails) {
            LinkedInDetails ref = (LinkedInDetails)linkedIn;
            ref.extraMethod();
        }
    }
}
