package chapter7.exercise6;

public class NickleNDime extends Account {
  int withdrawCount;

  public NickleNDime(int initialBalance) {
	super(initialBalance);
  }

  public void withdraw(int amount){
    withdrawCount++;
  }

  public int endMonthCharge() {
	return withdrawCount;
  }

  public void endMonth() {
	withdrawCount = 0;
  }
}
