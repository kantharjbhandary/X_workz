package casting;

public class GodDetails extends God {
    @Override
    public void worship() {
        System.out.println("Overridden: worship in GodDetails");
    }

    @Override
    public void teachings() {
        System.out.println("Overridden: teachings in GodDetails");
    }

    @Override
    public void temples() {
        System.out.println("Overridden: temples in GodDetails");
    }

    @Override
    public void faith() {
        System.out.println("Overridden: faith in GodDetails");
    }

    @Override
    public void festivals() {
        System.out.println("Overridden: festivals in GodDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in GodDetails");
    }
}
