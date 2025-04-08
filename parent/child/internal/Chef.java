package parent.child.internal;
public class Chef extends Cook {
    public Chef() {
        System.out.println("Running no-arg constructor in Chef");
    }
    public void skills() { System.out.println("Cooking have various cooking skills"); }
    public void ingredients() { System.out.println("it requires different ingredients"); }
    public void methods() { System.out.println("it involves different methods"); }
    public void cuisine() { System.out.println("it is influenced by different cuisines"); }
    public void tools() { System.out.println("it requires various tools and utensils"); }
    public void cookThefood()
    {
        System.out.println("Cooking food");
    }
}
