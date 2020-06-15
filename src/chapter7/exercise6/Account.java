package chapter7.exercise6;

public abstract class Account {
  private int balance;
  private int transactions;

  public Account(int initialBalance) {
	balance = initialBalance;
  }

  public int getBalance() {
	return balance;
  }

  public void setBalance(int balance) {
	this.balance = balance;
  }

  public int getTransactions() {
	return transactions;
  }

  public void setTransactions(int transactions) {
	this.transactions = transactions;
  }

  public boolean deposit(int amount) {
	if (amount > 0) {
	  balance += amount;
	  transactions++;
	  return true;
	} else return false;
  }

  public boolean withdraw(int amount) {
	if (amount <= balance && amount > 0) {
	  balance -= amount;
	  transactions++;
	  return true;
	} else return false;
  }

  public abstract int endMonthCharge();

  public void endMonth() {
	balance -= endMonthCharge();
	System.out.printf("\nBalance = %d. Transactions = %d. Fee = %d", balance, transactions, endMonthCharge());
	transactions = 0;
  }

  public static void main(String[] args) {
	NormalAccount normalAccount = new NormalAccount(50000);
	NickleNDime nickleNDime = new NickleNDime(80000);
	Gambler gambler = new Gambler(30000);

	normalAccount.deposit(5000);
	normalAccount.withdraw(60000);
	normalAccount.withdraw(1500);
	normalAccount.endMonth();

	nickleNDime.deposit(4000);
	nickleNDime.deposit(3000);
	nickleNDime.withdraw(50000);
	nickleNDime.withdraw(100000);
	nickleNDime.withdraw(5000);
	nickleNDime.endMonth();

	gambler.deposit(6000);
	gambler.withdraw(5000);
	gambler.withdraw(70000);
	gambler.endMonth();
  }
}
