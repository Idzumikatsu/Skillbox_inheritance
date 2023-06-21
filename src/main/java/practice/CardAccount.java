package practice;

public class CardAccount extends BankAccount {
    private static final double COMMISSION_PERCENT = 0.01D;

    public CardAccount() {
        super();
    }

    @Override
    public void take(double amountToTake) {
        amountToTake += amountToTake * COMMISSION_PERCENT;
        super.take(amountToTake);
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }
}
