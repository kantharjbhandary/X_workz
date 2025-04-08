package casting;

public class CPURunner {
    public static void main(String[] args) {

        CPU cPU = new CPU();
        cPU.cores();
        cPU.speed();
        cPU.architecture();
        cPU.powerConsumption();
        cPU.brands();
        System.out.println("----------------------");

        CPU cPUPoly = new CPUDetails();
        cPUPoly.cores();
        cPUPoly.speed();
        cPUPoly.architecture();
        cPUPoly.powerConsumption();
        cPUPoly.brands();
        System.out.println("----------------------");

        CPUDetails cPUDetails = new CPUDetails();
        cPUDetails.cores();
        cPUDetails.speed();
        cPUDetails.architecture();
        cPUDetails.powerConsumption();
        cPUDetails.brands();
        cPUDetails.extraMethod();
        System.out.println("----------------------");

        CPUCast cPUCast = new CPUCast();
        cPUCast.cast(cPUPoly);
    }
}
