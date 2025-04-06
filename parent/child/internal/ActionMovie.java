package parent.child.internal;

public class ActionMovie extends Movie {
    public ActionMovie() {
        System.out.println("Running no-arg constructor in ActionMovie");}
        @Override
        public void genre()
    { System.out.println("Movies have different categories"); }
        public void duration()
    { System.out.println("Movies have different timings"); }
        public void language() { System.out.println("Movies are available all langs"); }
        public void rating() { System.out.println("5 start rating"); }
        public void releaseYear() { System.out.println("Movie released in 20s"); }
    }
