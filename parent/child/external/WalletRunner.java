package parent.child.external;

import parent.child.internal.LeatherWallet;
import parent.child.internal.Wallet;

public class WalletRunner {
        public static void main(String[] args) {
            Wallet wallet = new Wallet();
            wallet.storeMoney();
            wallet.material();
            wallet.cardSlots();
            wallet.security();
            wallet.size();

            System.out.println("-------------------------");

            LeatherWallet leatherWallet = new LeatherWallet();
            leatherWallet.storeMoney();
            leatherWallet.material();
            leatherWallet.cardSlots();
            leatherWallet.security();
            leatherWallet.size();

            System.out.println("-------------------------");

            Wallet wallet1 = new LeatherWallet();
            wallet1.storeMoney();
            wallet1.material();
            wallet1.cardSlots();
            wallet1.security();
            wallet1.size();
        }
    }

