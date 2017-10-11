package com.cg.oraapps.lab3;

public class SavingsAccount extends Account {
	
	private static final int minimumBalance = 1000;

	public SavingsAccount(double balance, Person accountHolder) {
		super(balance, accountHolder);
	}
	
	@Override
	public void withDrawAmount(double amount){
		if(amount >= minimumBalance)
			this.balance = this.balance - amount;
		else 
			System.out.println("Insufficient funds to make the transaction");
	}
	
}
