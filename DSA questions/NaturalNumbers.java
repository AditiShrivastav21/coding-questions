package javapractice;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int Num = sc.nextInt();
		int sum = 0;
		
		//condition to print sum of n natural numbers
		for(int i =1; i<=Num; i++) {
			 sum += i;
			
		}
		
		System.out.println(sum);
		

	}

}
