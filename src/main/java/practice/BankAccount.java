package practice;

public class BankAccount {
  private double amount;

  public BankAccount() {
    amount = 0;
  }

  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0){
      amount += amountToPut;
    } else {
      System.out.println("Сумма для пополнения должна быть положительной");
    }
  }

  public void take(double amountToTake) {
    if (amount - amountToTake < 0) {
      System.out.println("Недостаточно денег на счете для совершения операции");
    } else {
      amount -= amountToTake;
    }
  }
}
