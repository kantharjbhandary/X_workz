package casting;

public class BankRunner {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.accounts();
        bank.transactions();
        bank.loans();
        bank.security();
        bank.investment();
        System.out.println("----------------------");

        Bank bankPoly = new BankDetails();
        bankPoly.accounts();
        bankPoly.transactions();
        bankPoly.loans();
        bankPoly.security();
        bankPoly.investment();
        System.out.println("----------------------");

        BankDetails bankDetails = new BankDetails();
        bankDetails.accounts();
        bankDetails.transactions();
        bankDetails.loans();
        bankDetails.security();
        bankDetails.investment();
        bankDetails.extraMethod();
        System.out.println("----------------------");

        BankCast bankCast = new BankCast();
        bankCast.cast(bankPoly);
    }
}
