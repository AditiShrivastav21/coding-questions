package javapractice;

import java.util.Scanner;

public class Factorial {
	
	public void fact(int n) {
		// condition if number is less than 0
		if(n==0) {
			System.out.println("Invalid number");
			return;
		}
		
		int fact = 1;
		
		for(int i =n; i>=1; i--) {
		fact =fact*i;
		}
		
		System.out.println("Factorail:  "+ fact);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter num :");
        int n = sc.nextInt();
        Factorial f = new Factorial();
        f.fact(n);
        

	}

}
