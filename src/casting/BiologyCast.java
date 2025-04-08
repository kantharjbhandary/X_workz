package casting;

public class BiologyCast {
    public void cast(Biology biology) {
        System.out.println("Casting Biology");
        biology.study();
        biology.branches();
        biology.evolution();
        biology.humanBody();
        biology.medicalImpact();
        if(biology instanceof BiologyDetails) {
            BiologyDetails ref = (BiologyDetails)biology;
            ref.extraMethod();
        }
    }
}
