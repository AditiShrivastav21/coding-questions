package javapractice;

import java.util.Scanner;

public class Add {
	
	public int sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter num 2 :");
		int num2 = sc.nextInt();
		
		int s = num1 + num2;
		
		
		return s;
		
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add a = new Add();
		int result = a.sum();
		System.out.println(result);
		
	
		
		

	}

}
