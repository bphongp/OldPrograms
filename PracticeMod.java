package misc;

import java.util.Scanner;

public class PracticeMod
{
	static Scanner read = new Scanner(System.in);
			
	public static void main(String[] args)
	{
		int fourDigit, thousands,
		hundreds, tens, ones;
		System.out.println("Please enter a four digit whole number");
		fourDigit = read.nextInt();
		
		System.out.println("You have entered: " + fourDigit);
		
		thousands = fourDigit / 1000;
		fourDigit = fourDigit % 1000;
		hundreds = fourDigit / 100;
		fourDigit = fourDigit % 100;
		tens = fourDigit / 10;
		fourDigit = fourDigit % 10;
		ones = fourDigit;
		
		System.out.println(+ thousands);
		System.out.println(+ hundreds);
		System.out.println(+ tens);
		System.out.println(+ ones);
	}

}

