package javapractice;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the num 2:");
		int num2 = sc.nextInt();
		// condition
		if(num1>num2) {
			System.out.println("Num 1 is greater");
		}
		
		else if (num1<num2) {
			System.out.println("Num 1 is lesser");
		
		}
		
		else {
			System.out.println("Num 1 is equal to Num 2");
		}
		

	}

}
