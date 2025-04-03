package parent.child.external;

import parent.child.internal.CPU;
import parent.child.internal.GamingCPU;

public class CPUrunner {
        public static void main(String[] args) {
            CPU cpu = new CPU();
            cpu.cores();
            cpu.speed();
            cpu.architecture();
            cpu.powerConsumption();
            cpu.brands();

            System.out.println("-------------------------");

            GamingCPU gamingCPU = new GamingCPU();
            gamingCPU.cores();
            gamingCPU.speed();
            gamingCPU.architecture();
            gamingCPU.powerConsumption();
            gamingCPU.brands();

            System.out.println("-------------------------");

            CPU cpu1 = new GamingCPU();
            cpu1.cores();
            cpu1.speed();
            cpu1.architecture();
            cpu1.powerConsumption();
            cpu1.brands();
        }
    }

