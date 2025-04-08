package casting;

public class TreeRunner {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.type();
        tree.height();
        tree.leaves();
        tree.lifespan();
        tree.uses();
        System.out.println("----------------------");

        Tree treePoly = new TreeDetails();
        treePoly.type();
        treePoly.height();
        treePoly.leaves();
        treePoly.lifespan();
        treePoly.uses();
        System.out.println("----------------------");

        TreeDetails treeDetails = new TreeDetails();
        treeDetails.type();
        treeDetails.height();
        treeDetails.leaves();
        treeDetails.lifespan();
        treeDetails.uses();
        treeDetails.extraMethod();
        System.out.println("----------------------");

        TreeCast treeCast = new TreeCast();
        treeCast.cast(treePoly);
    }
}
