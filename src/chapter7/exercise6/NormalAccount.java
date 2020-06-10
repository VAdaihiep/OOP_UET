package chapter7.exercise6;

public class NormalAccount extends Account {
  static int MONTHLY_FEE = 5;

  public NormalAccount(int initialBalance) {
	super(initialBalance);
  }

  public int endMonthCharge() {
	return MONTHLY_FEE;
  }
}
