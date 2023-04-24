package com.auto.javalearn;

public class BankAcc{
	
	Long BankAccNo = 1234567890l;
	String AccHolderName = "Vinoth Kumar";
	Integer AccBal = 5000;
	
	public void GetDetails(){
		System.out.println("Account Balance is " + AccBal);
		System.out.println("Account Number is " + BankAccNo);
		System.out.println("Account Holder Name is " + AccHolderName);
	}

	/*public void GetDetails() {
		System.out.println("Account Balance is " + AccBal);
	}*/
	public static void main(String[] args) {
		// Creating Object
		BankAcc Details = new BankAcc();
		Details.GetDetails();
		

	}

}


