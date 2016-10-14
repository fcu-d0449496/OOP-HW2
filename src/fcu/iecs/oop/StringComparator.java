package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		String str2;
		boolean A=true;
		Scanner scanner = new Scanner(System.in);
		while(A)
		{
			System.out.println("Enter a string 1:");
			str1=scanner.next();
			System.out.println("Enter a string 2:");
			str2=scanner.next();
			if(str1.equalsIgnoreCase(str2))
			{
				System.out.println("The two strings are the same.");
				break;
			}
			else
			System.out.println("The two strings are not the same.");
		}
	}

}
