package casting;

public class WalletRunner {
    public static void main(String[] args) {

        Wallet wallet = new Wallet();
        wallet.storeMoney();
        wallet.material();
        wallet.cardSlots();
        wallet.security();
        wallet.size();
        System.out.println("----------------------");

        Wallet walletPoly = new WalletDetails();
        walletPoly.storeMoney();
        walletPoly.material();
        walletPoly.cardSlots();
        walletPoly.security();
        walletPoly.size();
        System.out.println("----------------------");

        WalletDetails walletDetails = new WalletDetails();
        walletDetails.storeMoney();
        walletDetails.material();
        walletDetails.cardSlots();
        walletDetails.security();
        walletDetails.size();
        walletDetails.extraMethod();
        System.out.println("----------------------");

        WalletCast walletCast = new WalletCast();
        walletCast.cast(walletPoly);
    }
}
