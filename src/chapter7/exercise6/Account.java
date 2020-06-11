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
	try {
	  balance += amount;
	  transactions++;
	  return true;
	} catch (Exception e) {
	  e.printStackTrace();
	  return false;
	}
  }

  boolean withdraw(int amount) {
	try {
	  balance -= amount;
	  transactions++;
	  return true;
	} catch (Exception e) {
	  e.printStackTrace();
	  return false;
	}
  }

  public abstract int endMonthCharge();

  public void endMonth() {
	balance -= endMonthCharge();
	System.out.printf("Balance = %d. Transactions = %d. Fee = %d", balance, transactions, endMonthCharge());
	transactions = 0;
  }
}
