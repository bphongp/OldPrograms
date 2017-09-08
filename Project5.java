package misc;

import java.util.Scanner;
public class Project5
{
	static Scanner read = new Scanner(System.in);
			
	public static void main(String[] args)
	{
		int quarters, dimes, nickels, amount, originalAmount, subAmount;
		
		System.out.println("Enter the price of item");
		System.out.println("(from 25 cents to a dollar, in 5-cent increments): ");
		amount = read.nextInt();
		
		//calculations to get change amount
		originalAmount = amount;
		subAmount = 100 - amount;//since given in cents must subtract by largest amount
		quarters = subAmount / 25;
		subAmount = subAmount % 25;
		dimes = subAmount / 10;
		subAmount = subAmount % 10;
		nickels = subAmount;
		
		System.out.print("You bought an item for " + originalAmount);
		System.out.println(" cents and gave me a dollar,");
		System.out.println("so your change is");
		System.out.println("quarters: "+ quarters);
		System.out.println("dimes: "+ dimes);
		System.out.println("nickels: "+ nickels);
	}

}

