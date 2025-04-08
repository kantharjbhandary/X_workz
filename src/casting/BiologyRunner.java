package casting;

public class BiologyRunner {
    public static void main(String[] args) {

        Biology biology = new Biology();
        biology.study();
        biology.branches();
        biology.evolution();
        biology.humanBody();
        biology.medicalImpact();
        System.out.println("----------------------");

        Biology biologyPoly = new BiologyDetails();
        biologyPoly.study();
        biologyPoly.branches();
        biologyPoly.evolution();
        biologyPoly.humanBody();
        biologyPoly.medicalImpact();
        System.out.println("----------------------");

        BiologyDetails biologyDetails = new BiologyDetails();
        biologyDetails.study();
        biologyDetails.branches();
        biologyDetails.evolution();
        biologyDetails.humanBody();
        biologyDetails.medicalImpact();
        biologyDetails.extraMethod();
        System.out.println("----------------------");

        BiologyCast biologyCast = new BiologyCast();
        biologyCast.cast(biologyPoly);
    }
}
