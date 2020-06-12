package chapter7.exercise6;

public class NickleNDime extends Account {
  static final int FEE_PER_WITHDRAW = 2000;
  private int withdrawCount;

  public int getWithdrawCount() {
	return withdrawCount;
  }

  public void setWithdrawCount(int withdrawCount) {
	this.withdrawCount = withdrawCount;
  }

  public NickleNDime(int initialBalance) {
	super(initialBalance);
  }

  public boolean withdraw(int amount) {
	try {
	  setWithdrawCount(withdrawCount++);
	  return true;
	} catch (Exception e) {
	  e.printStackTrace();
	  return false;
	}
  }

  public int endMonthCharge() {
	return getWithdrawCount() * FEE_PER_WITHDRAW;
  }

  public void endMonth() {
	setWithdrawCount(0);
  }
}
