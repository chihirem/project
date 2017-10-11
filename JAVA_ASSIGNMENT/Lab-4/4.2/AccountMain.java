package com.cg.oraapps.lab3;

public class AccountMain {

	public static void main(String[] args) {
		Person p1 = new Person("Smith", 21);
		Account acc1 = new SavingsAccount(2000, p1);
		
		Person p2 = new Person("Kathy", 28);
		Account acc2 = new CurrentAccount(3000, p2);
		
		acc1.depositAmount(2000);
		acc2.withDrawAmount(2000);
		
		System.out.println(acc1.toString());
		System.out.println("Balance : " + acc1.getBalance());
		
		System.out.println(acc2.toString());
		System.out.println("Balance : " + acc2.getBalance());
	}

}
