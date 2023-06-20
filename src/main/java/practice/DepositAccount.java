package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    public DepositAccount() {
        super();
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {
        int isOneMonthLeft = LocalDate.now().compareTo(lastIncome.plusMonths(1));
        if (isOneMonthLeft > 0){
            super.take(amountToTake);
        }
    }


}
