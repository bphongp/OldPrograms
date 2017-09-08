package misc;

import java.util.Scanner;

public class SimpleStringCharApplication
{	
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String fourDigit;

		System.out.println("Please enter a four digit whole number");
		fourDigit = read.nextLine();
		
		char integer1 = fourDigit.charAt(0);
		char integer2 = fourDigit.charAt(1);
		char integer3 = fourDigit.charAt(2);
		char integer4 = fourDigit.charAt(3);
		
		System.out.println(integer1);		
		System.out.println(integer2);
		System.out.println(integer3);
		System.out.println(integer4);

	}

}


