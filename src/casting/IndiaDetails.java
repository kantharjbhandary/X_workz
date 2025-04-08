package casting;

public class IndiaDetails extends India {
    @Override
    public void states() {
        System.out.println("Overridden: states in IndiaDetails");
    }

    @Override
    public void diversity() {
        System.out.println("Overridden: diversity in IndiaDetails");
    }

    @Override
    public void economy() {
        System.out.println("Overridden: economy in IndiaDetails");
    }

    @Override
    public void history() {
        System.out.println("Overridden: history in IndiaDetails");
    }

    @Override
    public void festivals() {
        System.out.println("Overridden: festivals in IndiaDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in IndiaDetails");
    }
}
