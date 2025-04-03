package parent.child.external;

import parent.child.internal.Biology;
import parent.child.internal.Genetics;

public class BiologyRunner {

        public static void main(String[] args) {
            Biology biology = new Biology();
            biology.study();
            biology.branches();
            biology.evolution();
            biology.humanBody();
            biology.medicalImpact();

            System.out.println("-------------------------");

            Genetics genetics = new Genetics();
            genetics.study();
            genetics.branches();
            genetics.evolution();
            genetics.humanBody();
            genetics.medicalImpact();

            System.out.println("-------------------------");

            Biology biology1 = new Genetics();
            biology1.study();
            biology1.branches();
            biology1.evolution();
            biology1.humanBody();
            biology1.medicalImpact();
        }
    }

