package chapter7.exercise6;

public class NormalAccount extends Account {
  private int MONTHLY_FEE = 10000;

  public NormalAccount(int initialBalance) {
	super(initialBalance);
  }

  @Override
  public int endMonthCharge() {
	return MONTHLY_FEE;
  }
}
