package casting;

public class LinkedInRunner {
    public static void main(String[] args) {

        LinkedIn linkedIn = new LinkedIn();
        linkedIn.connections();
        linkedIn.jobs();
        linkedIn.articles();
        linkedIn.endorsements();
        linkedIn.messages();
        System.out.println("----------------------");

        LinkedIn linkedInPoly = new LinkedInDetails();
        linkedInPoly.connections();
        linkedInPoly.jobs();
        linkedInPoly.articles();
        linkedInPoly.endorsements();
        linkedInPoly.messages();
        System.out.println("----------------------");

        LinkedInDetails linkedInDetails = new LinkedInDetails();
        linkedInDetails.connections();
        linkedInDetails.jobs();
        linkedInDetails.articles();
        linkedInDetails.endorsements();
        linkedInDetails.messages();
        linkedInDetails.extraMethod();
        System.out.println("----------------------");

        LinkedInCast linkedInCast = new LinkedInCast();
        linkedInCast.cast(linkedInPoly);
    }
}
