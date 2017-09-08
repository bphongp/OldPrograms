package gameMenu;

import java.util.Scanner;

public class HighLowGuess
{
	private static int localRandomNumber = 0; //*** Eclipse makes them blue
	private static Scanner scan = new  Scanner(System.in);
	static Scanner read = new Scanner(System.in);
	public static void highLowGuessMethod() throws InterruptedException
	{
		introduction();
		String replayOption = "Yes";
		while(replayOption.equalsIgnoreCase("Yes"))
		{
			randomNumberGenerator();
			usersGuessing();
			replayOption = readReplayGuessing();
			//replayOption
		}
	}

	private static void randomNumberGenerator() throws InterruptedException
	{
		localRandomNumber = (int)((Math.random() * 100) + 1);
		System.out.println("**not in real program **randomNumber is " +localRandomNumber);
	}

	private static void introduction() throws InterruptedException
	{
		System.out.println("" +
				"                   This program allows you to guess a random integer\n"+
				"                   between 1 and 100 inclusive. The computer creates\n" +
				"                   a random number and tells you if your guess was\n" +
				"                   correct, hi or low. \n");
	}
	private static void usersGuessing() throws InterruptedException
	{
		System.out.println("Please guess the number");
		int numberGuessed = scan.nextInt();
		int count = 1;
		while(numberGuessed < localRandomNumber || numberGuessed > localRandomNumber)
		{	
			count++;
			if(numberGuessed < localRandomNumber)
			{
				System.out.println("You were low.");
				System.out.println("Please guess again");
				numberGuessed = scan.nextInt();
			}
			else
			{
				System.out.println("You were hi.");
				System.out.println("Please guess again");
				numberGuessed = scan.nextInt();
			}
		}
		System.out.println("Good job! You got the number with " +count+" tries");
	}
	private static String readReplayGuessing()
	{
		//Scanner scan = new Scanner(System.in);
		String replayOption;
		String indent = "                   ";
		System.out.println(indent+ "Would you like to guess another number?(yes/no)");
		replayOption = read.nextLine();
		return replayOption;
	}
}

