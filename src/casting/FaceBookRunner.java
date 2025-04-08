package casting;

public class FaceBookRunner {
    public static void main(String[] args) {

        FaceBook faceBook = new FaceBook();
        faceBook.features();
        faceBook.users();
        faceBook.privacy();
        faceBook.advertising();
        faceBook.communication();
        System.out.println("----------------------");

        FaceBook faceBookPoly = new FaceBookDetails();
        faceBookPoly.features();
        faceBookPoly.users();
        faceBookPoly.privacy();
        faceBookPoly.advertising();
        faceBookPoly.communication();
        System.out.println("----------------------");

        FaceBookDetails faceBookDetails = new FaceBookDetails();
        faceBookDetails.features();
        faceBookDetails.users();
        faceBookDetails.privacy();
        faceBookDetails.advertising();
        faceBookDetails.communication();
        faceBookDetails.extraMethod();
        System.out.println("----------------------");

        FaceBookCast faceBookCast = new FaceBookCast();
        faceBookCast.cast(faceBookPoly);
    }
}
