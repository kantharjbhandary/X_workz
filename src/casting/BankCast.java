package casting;

public class BankCast {
    public void cast(Bank bank) {
        System.out.println("Casting Bank");
        bank.accounts();
        bank.transactions();
        bank.loans();
        bank.security();
        bank.investment();
        if(bank instanceof BankDetails) {
            BankDetails ref = (BankDetails)bank;
            ref.extraMethod();
        }
    }
}
