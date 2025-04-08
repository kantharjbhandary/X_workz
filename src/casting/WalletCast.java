package casting;

public class WalletCast {
    public void cast(Wallet wallet) {
        System.out.println("Casting Wallet");
        wallet.storeMoney();
        wallet.material();
        wallet.cardSlots();
        wallet.security();
        wallet.size();
        if(wallet instanceof WalletDetails) {
            WalletDetails ref = (WalletDetails)wallet;
            ref.extraMethod();
        }
    }
}
