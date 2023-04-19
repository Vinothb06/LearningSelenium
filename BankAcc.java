package com.auto.javalearn;

public class BankAcc{
	
	Long BankAccNo = 1234567890l;
	String AccHolderName = "Vinoth Kumar";
	Integer AccBal = 5000;
	
	public void GetBal(){
		System.out.println("Account Balance is " + AccBal);
	}
	public void GetAccNo(){
		System.out.println("Account Number is " + BankAccNo);
	}
	public void GetName(){
		System.out.println("Account Holder Name is " + AccHolderName);
	}

	/*public void GetDetails() {
		System.out.println("Account Balance is " + AccBal);
	}*/
	public static void main(String[] args) {
		// Creating Object
		BankAcc Balence = new BankAcc();
		Balence.GetBal();
		BankAcc Number = new BankAcc();
		Number.GetAccNo();
		BankAcc Name = new BankAcc();
		Name.GetName();

	}

}

