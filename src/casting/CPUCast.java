package casting;

public class CPUCast {
    public void cast(CPU cPU) {
        System.out.println("Casting CPU");
        cPU.cores();
        cPU.speed();
        cPU.architecture();
        cPU.powerConsumption();
        cPU.brands();
        if(cPU instanceof CPUDetails) {
            CPUDetails ref = (CPUDetails)cPU;
            ref.extraMethod();
        }
    }
}
