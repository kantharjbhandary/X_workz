package parent.child.external;

import parent.child.internal.MechanicalPencil;
import parent.child.internal.Pencil;

public class PemcilRunner {
        public static void main(String[] args) {
            Pencil pencil = new Pencil();
            pencil.material();
            pencil.leadType();
            pencil.usage();
            pencil.brand();
            pencil.eraser();

            System.out.println("-------------------------");

            MechanicalPencil mechanicalPencil = new MechanicalPencil();
            mechanicalPencil.material();
            mechanicalPencil.leadType();
            mechanicalPencil.usage();
            mechanicalPencil.brand();
            mechanicalPencil.eraser();

            System.out.println("-------------------------");

            Pencil pencil1 = new MechanicalPencil();
            pencil1.material();
            pencil1.leadType();
            pencil1.usage();
            pencil1.brand();
            pencil1.eraser();
        }
    }

