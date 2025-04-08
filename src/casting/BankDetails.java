package casting;

public class BankDetails extends Bank {
    @Override
    public void accounts() {
        System.out.println("Overridden: accounts in BankDetails");
    }

    @Override
    public void transactions() {
        System.out.println("Overridden: transactions in BankDetails");
    }

    @Override
    public void loans() {
        System.out.println("Overridden: loans in BankDetails");
    }

    @Override
    public void security() {
        System.out.println("Overridden: security in BankDetails");
    }

    @Override
    public void investment() {
        System.out.println("Overridden: investment in BankDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in BankDetails");
    }
}
