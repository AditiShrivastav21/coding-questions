package javapractice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the button number:");
		int button = sc.nextInt();
		
		//condition
		switch(button) {
		case 1: System.out.println("Hello");
		break;
		case 2: System.out.println("Namaste");
		break;
		case 3: System.out.println("bonjour");
		break;
		default : System.out.println("Invalid button");
		}
	}

}
