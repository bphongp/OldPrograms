package misc;

import java.util.Scanner;

public class SimpleSwitchCelsiustoFerenheit
{
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double degreesC, degreesF;
		System.out.print("This program will convert your temperature");
		System.out.println(" from celsius to ferenheit or vice versa");
		System.out.println("With a space between, please enter the temperature and indicate c or f:");
		double temp = read.nextDouble();
		System.out.println("The integer entered:" +temp);
		char scale = read.next().charAt(0);
		System.out.println("The scale entered:" +scale);

		switch (scale)
		{
			case 'c':
			case 'C':
				degreesF = 9 *(temp /5) + 32;
				System.out.print("The conversion to Ferenheit will be: ");
				System.out.println(+degreesF+ " F");
				break;
			case 'f':
			case 'F':
				degreesC = 5 * (temp - 32)/9;
				System.out.print("The conversion to Celsius will be: ");
				System.out.println(+degreesC+ " C");
				break;
			default:
				System.out.println("An error occured, check your units");
				break;
		}
	}
}

