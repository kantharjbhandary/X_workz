package parent.child.internal;

public class Genetics extends Biology {
    public Genetics() {
        System.out.println("Running no-arg constructor in Genetics");
    }

    @Override
    public void study() {
        System.out.println("Biology is the study of living organisms...");
    }

    public void branches() {
        System.out.println("it includes zoology, botany, genetics, and microbiology.");
    }

    public void evolution() {
        System.out.println("it Explains how life has evolved over time.");
    }

    public void humanBody() {
        System.out.println("the Biology helps in understanding human anatomy and physiology.");
    }

    public void medicalImpact() {
        System.out.println("the Biology contributes to medicine and healthcare.");
    }
}