package parent.child.external;

import parent.child.internal.Physics;
import parent.child.internal.QuantumPhysics;

public class PhysicsRunner {

        public static void main(String[] args) {
            Physics physics = new Physics();
            physics.study();
            physics.laws();
            physics.applications();
            physics.experiments();
            physics.famousScientists();

            System.out.println("-------------------------");

            QuantumPhysics quantumPhysics = new QuantumPhysics();
            quantumPhysics.study();
            quantumPhysics.laws();
            quantumPhysics.applications();
            quantumPhysics.experiments();
            quantumPhysics.famousScientists();

            System.out.println("-------------------------");

            Physics physics1 = new QuantumPhysics();
            physics1.study();
            physics1.laws();
            physics1.applications();
            physics1.experiments();
            physics1.famousScientists();
        }
    }

