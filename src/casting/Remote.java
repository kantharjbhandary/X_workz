package casting;

public class Remote {
    public Remote() {
        System.out.println("Running no-arg constructor in Remote");
    }
    public void deviceCompatibility() { System.out.println("Remotes work with different devices"); }
    public void batteryType() { System.out.println("Remotes use different types of batteries"); }
    public void numberOfButtons() { System.out.println("Remotes have varying numbers of buttons"); }
    public void wireless() { System.out.println("Some remotes are wireless"); }
    public void brand() { System.out.println("Remotes come from different brands"); }
}