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

  public int getTransactionCount() {
	return transactions;
  }

  boolean deposit(int amount) {
	if (amount > 0) {
	  balance += amount;
	  transactions++;
	  return true;
	} else return false;
  }

  boolean withdraw(int amount) {
	if (amount <= balance && amount > 0) {
	  balance -= amount;
	  transactions++;
	  return true;
	} else return false;
  }

  public abstract int endMonthCharge();

  void endMonth() {
	balance -= endMonthCharge();
	System.out.printf("Balance = %d. Transactions = %d. Fee = %d", balance, transactions, endMonthCharge());
	transactions = 0;
  }
}
