

public class SavingsAccount extends Account {
	
	private static final int minimumBalance = 1000;

	public SavingsAccount(double balance, Person accountHolder) {
		super(balance, accountHolder);
	}
	
	public void withDrawAmount(double amount){
		if(amount >= minimumBalance)
			this.balance = this.balance - amount;
		else 
			System.out.println("Insufficient funds to make the transaction");
	}
	
}
