package com.auto.javalearn;

public class BankAcc{
	
	Long BankAccNo = 1234567890l;
	String AccHolderName = "Vinoth Kumar";
	Integer AccBal = 5000;
	
	public void GetBal(){
		System.out.println("Account Balance is " + AccBal);
	}
	
	

	/*public void GetDetails() {
		System.out.println("Account Balance is " + AccBal);
	}*/
	public static void main(String[] args) {
		// Creating Object
		BankAcc Balence = new BankAcc();
		Balence.GetBal();
		

	}

}
