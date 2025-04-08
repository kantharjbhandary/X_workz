package casting;

public class WalletDetails extends Wallet {
    @Override
    public void storeMoney() {
        System.out.println("Overridden: storeMoney in WalletDetails");
    }

    @Override
    public void material() {
        System.out.println("Overridden: material in WalletDetails");
    }

    @Override
    public void cardSlots() {
        System.out.println("Overridden: cardSlots in WalletDetails");
    }

    @Override
    public void security() {
        System.out.println("Overridden: security in WalletDetails");
    }

    @Override
    public void size() {
        System.out.println("Overridden: size in WalletDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in WalletDetails");
    }
}
