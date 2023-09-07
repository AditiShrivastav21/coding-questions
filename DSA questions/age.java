package javapractice;

import java.util.Scanner;

import java.util.*;
public class age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the user:");
		int age = sc.nextInt();
		//condition
		if(age>18) {
			System.out.println("Adult");
		}
		
		else {
			System.out.println("Not Adult");
		}
				
		

	}

}
