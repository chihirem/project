
public class Account {
	private long accountNumber = 129093123;
	protected double balance;
	protected Person accountHolder;
	private static int accountNumCount = 0; 
	
	public Account(double balance, Person accountHolder) {
		this.accountNumber = accountNumber + accountNumCount;
		accountNumCount++;
		if (balance < 500)
			balance = 500;
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if (balance < 500)
			balance = 500;
		this.balance = balance;
	}
	public Person getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(Person accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void withDrawAmount(double amount){
		if(balance > amount)
			balance =balance-amount;
		else
			System.out.println("Insufficient Funds");
	}
	
	public void depositAmount(double amount){
		this.balance = this.balance + amount;
	}
		
	public String toString(){
		String accountDetails;
		accountDetails = "Acc No :" + accountNumber + "\n" + "Acc Holder Name : " + this.accountHolder.getName();
		return accountDetails;
	}
}
