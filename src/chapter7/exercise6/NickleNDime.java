package chapter7.exercise6;

public class NickleNDime extends Account {
  private int FEE_PER_WITHDRAW = 2000;
  private int withdrawCount;

  public NickleNDime(int initialBalance) {
	super(initialBalance);
  }

  public boolean withdraw(int amount) {
	try {
	  withdrawCount++;
	  return true;
	} catch (Exception e) {
	  e.printStackTrace();
	  return false;
	}
  }

  public int endMonthCharge() {
	return withdrawCount * FEE_PER_WITHDRAW;
  }

  public void endMonth() {
	withdrawCount = 0;
  }


}
