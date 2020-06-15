package chapter7.exercise6;

public class Gambler extends Account {
  private int probability;

  public Gambler(int initialBalance) {
	super(initialBalance);
  }

  @Override
  public boolean withdraw(int amount) {
	probability = (int) (Math.random() * 100 + 1);
	if (amount <= getBalance() && amount > 0) {
	  if (probability > 49) {
		setBalance(getBalance() - 2 * amount);
	  }
	  setTransactions(getTransactions() + 1);
	  return true;
	} else {
	  return false;
	}

  }

  @Override
  public int endMonthCharge() {
	return 0;
  }
}
