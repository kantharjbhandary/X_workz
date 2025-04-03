package parent.child.external;

import parent.child.internal.OakTree;
import parent.child.internal.Tree;

public class TreeRunner {

        public static void main(String[] args) {
            Tree tree = new Tree();
            tree.type();
            tree.height();
            tree.leaves();
            tree.lifespan();
            tree.uses();

            System.out.println("-------------------------");

            OakTree oakTree = new OakTree();
            oakTree.type();
            oakTree.height();
            oakTree.leaves();
            oakTree.lifespan();
            oakTree.uses();

            System.out.println("-------------------------");

            Tree tree1 = new OakTree();
            tree1.type();
            tree1.height();
            tree1.leaves();
            tree1.lifespan();
            tree1.uses();
        }
    }

