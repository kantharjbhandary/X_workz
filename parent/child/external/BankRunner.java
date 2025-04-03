package parent.child.external;

import parent.child.internal.Bank;
import parent.child.internal.PrivateBank;

public class BankRunner {

        public static void main(String[] args) {
            Bank bank = new Bank();
            bank.accounts();
            bank.transactions();
            bank.loans();
            bank.security();
            bank.investment();

            System.out.println("-------------------------");

            PrivateBank privateBank = new PrivateBank();
            privateBank.accounts();
            privateBank.transactions();
            privateBank.loans();
            privateBank.security();
            privateBank.investment();

            System.out.println("-------------------------");

            Bank bank1 = new PrivateBank();
            bank1.accounts();
            bank1.transactions();
            bank1.loans();
            bank1.security();
            bank1.investment();
        }
    }

