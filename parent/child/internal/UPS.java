package parent.child.internal;

public class UPS {
    public UPS() {
        System.out.println("Running no-arg constructor in UPS");
    }

    public void powerBackup() { System.out.println("UPS provides backup power during outages."); }
    public void batteryType() { System.out.println("Uses lead-acid or lithium-ion batteries."); }
    public void applications() { System.out.println("Used in homes, offices, and data centers."); }
    public void chargingTime() { System.out.println("UPS batteries need time to recharge."); }
    public void efficiency() { System.out.println("Different UPS models have different efficiency levels."); }
}