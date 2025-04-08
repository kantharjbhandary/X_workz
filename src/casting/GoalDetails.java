package casting;

public class GoalDetails extends Goal {
    @Override
    public void motivation() {
        System.out.println("Overridden: motivation in GoalDetails");
    }

    @Override
    public void achievement() {
        System.out.println("Overridden: achievement in GoalDetails");
    }

    @Override
    public void planning() {
        System.out.println("Overridden: planning in GoalDetails");
    }

    @Override
    public void types() {
        System.out.println("Overridden: types in GoalDetails");
    }

    @Override
    public void measurement() {
        System.out.println("Overridden: measurement in GoalDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in GoalDetails");
    }
}
