package chapter7.exercise6;

public class Gambler extends Account {
  private int probability;

  public Gambler(int initialBalance) {
	super(initialBalance);
	this.probability = (int) (Math.random() * 100 + 1);
  }

  public int getProbability() {
	return probability;
  }

  public boolean withdraw(int amount) {
	try {
	  if (getProbability() > 49) {
		setBalance(getBalance() - 2 * amount);
	  }
	  return true;
	} catch (Exception e) {
	  e.printStackTrace();
	  return false;
	}
  }

  @Override
  public int endMonthCharge() {
	return 0;
  }
}
