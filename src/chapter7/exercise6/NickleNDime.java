package chapter7.exercise6;

public class NickleNDime extends Account {
  private int FEE_PER_WITHDRAW = 2000;
  private int withdrawCount = 0;

  public NickleNDime(int initialBalance) {
	super(initialBalance);
  }

  @Override
  public boolean withdraw(int amount) {
	if (amount <= getBalance() && amount > 0) {
	  setBalance(getBalance() - amount);
	  setTransactions(getTransactions() + 1);
	  withdrawCount++;
	  return true;
	} else {
	  return false;
	}
  }

  @Override
  public int endMonthCharge() {
	return withdrawCount * FEE_PER_WITHDRAW;
  }
}
