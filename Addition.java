package Samples;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a, b, c, sum;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		a = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		b = sc.nextInt();  
		System.out.print("Enter the third number: ");  
		c = sc.nextInt();  
		//sum= (a+b+c);
		sum = sum(a, b, c);  
		System.out.println("The sum of three numbers x, y, and z is: " + sum);  
		
	}

	private static int sum(int a, int b, int c) {
		// TODO Auto-generated method stub
		int sum = a + b + c;  
		return sum;  
	}

}
