package misc;

import java.util.Scanner;

public class Change
{	
	static Scanner keyboard = new Scanner(System.in);
			
	public static void main(String [] args)
	{
		//**need to figure out variables**//
		int amount, originalAmount, quarters, dimes, nickels, pennies;

		System.out.println("Enter a whole number from 1 to 99.");
		System.out.println("I will find a combination of coins");
		System.out.println("that equals that amount of change.");
		
		amount = keyboard.nextInt();
		//** need to read amount entered**//
		
		originalAmount = amount; //** read the amount into the variable amount**//
		quarters = amount/25;
		amount = amount % 25;
		dimes = amount/10;
		amount = amount % 10;
		nickels = amount/5;
		amount = amount % 5;
		pennies = amount;
		
		System.out.println(originalAmount + " cents in coins can be given as:");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
		
	}

}


