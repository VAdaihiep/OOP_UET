package chapter7.exercise6;

public class Gambler extends Account {
  int probability;

  public Gambler(int initialBalance) {
	super(initialBalance);
  }

  public boolean withdraw(int amount) {
	try {
	  int balance = getBalance();
	  if (probability == 51) {
		balance -= amount * 2;
		setBalance(balance);
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
