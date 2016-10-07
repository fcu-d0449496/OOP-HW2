package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		float B;
		String C ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer:");
		A=scanner.nextInt();
		System.out.println("Enter a float point number:");
		B=scanner.nextFloat();
		System.out.println("Enter a you name:");
		C=scanner.next();
		System.out.printf("Hi %s, the multiplication of %d and %f is %1.2e.",C,A,B,A*B);
	}
}
