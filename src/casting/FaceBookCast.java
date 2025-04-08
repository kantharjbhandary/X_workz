package casting;

public class FaceBookCast {
    public void cast(FaceBook faceBook) {
        System.out.println("Casting FaceBook");
        faceBook.features();
        faceBook.users();
        faceBook.privacy();
        faceBook.advertising();
        faceBook.communication();
        if(faceBook instanceof FaceBookDetails) {
            FaceBookDetails ref = (FaceBookDetails)faceBook;
            ref.extraMethod();
        }
    }
}
