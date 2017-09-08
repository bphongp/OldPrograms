package misc;

import java.util.Scanner;

public class CeltoFer
{
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args)
	{
		double degreesF, degreesC, computeF;
		System.out.println("Please enter a temperature in degrees Fahrenheit: ");
		degreesF = read.nextDouble();
		System.out.println(+ degreesF);
		
		computeF = degreesF;
		degreesC = 5 * (degreesF - 32)/9;
		
		System.out.print(+ computeF + " degrees Fahrenheit is ");
		System.out.println(+ degreesC + " degrees Celscius");
	}
}



