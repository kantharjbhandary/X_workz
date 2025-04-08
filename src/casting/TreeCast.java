package casting;

public class TreeCast {
    public void cast(Tree tree) {
        System.out.println("Casting Tree");
        tree.type();
        tree.height();
        tree.leaves();
        tree.lifespan();
        tree.uses();
        if(tree instanceof TreeDetails) {
            TreeDetails ref = (TreeDetails)tree;
            ref.extraMethod();
        }
    }
}
