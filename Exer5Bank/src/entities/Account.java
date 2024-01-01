package entities;

public class Account {
	private int number;
	private String name;
	private double balance;
	
	public Account(int number,String name) {
		this.number = number;
		this.name = name;
	}
	
	public Account(int number,String name,double initialDeposit) {
		this.number = number;
		this.name = name;
		DepositValue(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void DepositValue(double value) {
		this.balance = this.balance + value;
	}
	
	public void WithdrawValue(double value) {
		this.balance = this.balance - value - 5.00;
	}
	
	public String toString() {
		return "Account "
			 +  getNumber()
			 + ", Holder: "
			 +  getName()
			 + ", Balance: $ "
			 + String.format("%.2f%n", getBalance());
	}
}
