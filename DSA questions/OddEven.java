package javapractice;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// take input from user
		System.out.println("Enter the Number:");
		int Num = sc.nextInt();
		//condition to find odd or even
		if(Num%2==0) {
			//condition for even number
			System.out.println("Even Number"); 
		}
		
		
		else {
			System.out.println("Odd Number");
		}
		
			
	}

}
