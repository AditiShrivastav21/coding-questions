package javapractice;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		//condition to print the table 
		
		for(int i =1; i<=10; i++) {
			int t = num * i;
			System.out.println(num + " X " + i + " = " + t);
			
		}
		
	}

}
