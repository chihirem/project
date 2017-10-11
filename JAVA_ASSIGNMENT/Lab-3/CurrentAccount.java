

public class CurrentAccount extends Account {
	
	private static final int overDraftLimit = 5000;
	private int overdraft = 0; 

	public CurrentAccount(double balance, Person accountHolder) {
		super(balance, accountHolder);
	}
	
	public void withDrawAmount(double amount){
		if(!reachedOverDraftLimit()){
			if(balance > amount)
				this.balance = this.balance - amount;
			else if(balance + (overDraftLimit - overdraft) > amount){
				balance = 0;
				overdraft  += (amount - balance);
			}
			else
				System.out.println("Insufficient Funds");
		}
		else
			System.out.println("Overdraft limit reached");
	
	}
	
	private boolean reachedOverDraftLimit(){
		if (overdraft >= overDraftLimit)
			return true;
		else
			return false;
	}
}
