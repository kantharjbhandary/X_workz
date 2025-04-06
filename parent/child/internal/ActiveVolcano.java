package parent.child.internal;

public class ActiveVolcano extends Valcano {
    public ActiveVolcano() {
        System.out.println("Running no-arg constructor in ActiveVolcano");
    }
    @Override
    public void type() { System.out.println("Volcanoes can be active"); }
    public void eruption() { System.out.println("Volcanoes erupt gas"); }
    public void location() { System.out.println("Volcanos found in some regions"); }
    public void impact() { System.out.println("Volcanic erupts more"); }
    public void monitoring() { System.out.println("Volcanoes are monitored by science"); }
}