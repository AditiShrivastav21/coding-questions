package javapractice;

import java.util.*;

public class Multiply {

    public int mul(int a, int b) {
        int m = a * b;
        return m;
    }

    public static void main(String[] args) {
        Multiply multiplier = new Multiply(); // Create an instance of Multiply

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2:");
        int num2 = sc.nextInt();

        int result = multiplier.mul(num1, num2); // Call the mul method
        System.out.println("Product is: " + result);
    }
}
