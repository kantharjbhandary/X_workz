package parent.child.internal;


    public class PrivateBank extends Bank {
        public PrivateBank() {
            System.out.println("Running no-arg constructor in PrivateBank");
        }
        @Override
        public void accounts() { System.out.println(" the Banks manage different types of accounts"); }
        public void transactions() { System.out.println(" the Banks facilitate transactions"); }
        public void loans() { System.out.println(" the Banks provide loans"); }
        public void security() { System.out.println(" the Banks ensure financial security"); }
        public void investment() { System.out.println(" the Banks offer investment opportunities"); }
    }

