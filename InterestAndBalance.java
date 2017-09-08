package misc;

import java.util.Scanner;

public class InterestAndBalance
{
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double originalBalance, newBalance, transactionAmount,
		interest, yearlyPercentage, balanceInterest, balance;
		
		int month = 1;
		boolean withdrawal = false;
		//boolean month = true;
		
		System.out.println("Enter your current savings balance: ");
		originalBalance = read.nextDouble();
		System.out.println("Original savings balance: " + originalBalance);
		
		balance = originalBalance;
		while (month <= 12)
		{	
			System.out.println("Enter the yearly percentage rate: ");
			yearlyPercentage = read.nextDouble();
			interest = yearlyPercentage /12;
			System.out.println("The monthly interest rate: " +interest);
			
			
			System.out.println("Enter a transaction amount: ");
			transactionAmount = read.nextDouble();
			System.out.println("The transaction amount entered was: "+transactionAmount);
			
			System.out.println("If withdrawal enter w, deposit enter d, exit enter e");
			String kindOfTrans = read.next();
			kindOfTrans = kindOfTrans.substring(0,1);
			//int indexTrans = kindOfTrans.indexOf("y");
			//System.out.println("index of y or n is :/" +indexTrans);
			System.out.println("You have entered a:"+kindOfTrans);
			kindOfTrans = kindOfTrans.toLowerCase();
			
			if (kindOfTrans.equals("y")) withdrawal = true;
			{
				newBalance = balance - transactionAmount;
				System.out.println("Your new balance after withdrawal is : " +newBalance);
				month++;
				System.out.println("Month is now: " +month);
			}
			if (kindOfTrans.equals("n")) withdrawal = false;
			{
			newBalance = balance + transactionAmount;
			System.out.println("Your new balance after deposit is : " +newBalance);
			month++;
			System.out.println("Month is now: " +month);
			}
		}
		
		System.out.println("That was a year");
			
		
	}

}


