package gameMenu;

import java.util.Scanner;
public class GuessTheChar
{
	private static String userString;
	private static String spaces = "                     ";
	private static int lengthUserString;
	private static String legalCharacters = "abcdefghijklmnopqrstuvwxyz ";
	private static String guessedCharacter;
	private static String answerString;
	private static boolean isLegal = false;
	private static boolean win = false;
	private static Scanner scan = new  Scanner(System.in);
	static Scanner read = new Scanner(System.in);
	
	public static void guessTheCharMethod() throws InterruptedException
	{
		String choice = "Yes";
		while(choice.equalsIgnoreCase("Yes"))
		{
			introduction();
			checkforLegalCh();
			isLegal = false;
			readInputString();
			answerString();
			int totalGuess = 0;
			win = false;
			while(!win)
			{
				totalGuess++;
				guessChar();
			}
			System.out.println("The total guess it took: " +totalGuess);
			choice = shouldIStayInLoop();
		}
	}

	private static void introduction() throws InterruptedException
	{
		System.out.println("" +
				"                   This game prompts for a string of words. It\n"+
				"                   then allows the player to guess the characters\n" +
				"                   in the string of words. It keeps track of the\n"+
				"		   characters guessed and tells the player when he wins.\n\n"+
				"		   Please enter a string of words.");

		userString = read.nextLine();
		
	}
	private static String readInputString() throws InterruptedException
	{
		userString = userString.toLowerCase();
		lengthUserString = userString.length();
		return userString;
	}
	private static void guessChar()
	{
		System.out.println("Original String:" +userString);
		System.out.print("Guessed String: " +answerString);
		System.out.println("\nCharacters to choose from: ");
		System.out.println(legalCharacters);
		System.out.println("\n\nPlease enter a character.\n\n\n\n\n\n");
		guessedCharacter = read.nextLine();
		
		//find the amount of letters that shows up
		int found = 0;
		if (containChar(guessedCharacter))
		{
			found = updateGame(guessedCharacter);
		}
		updateAvailableChoices(guessedCharacter);
		System.out.println("Character read: "+guessedCharacter);

		System.out.println("\n\nThe string contains " +found+" "
		+guessedCharacter+" in the string\n\n\n\n");
		gameOver();
	}
	//finding the position of the letter in string
	private static int updateGame(String letter)
	{
		int found =0;
		for(int i=0; i<userString.length();i++)
		{
			if(userString.charAt(i) == letter.charAt(0))
			{
				String previous = answerString.substring(0,i).concat(letter);
				answerString = previous.concat(answerString.substring(i+1));
				found++;
			}
		}
		return found;
	}
	//check for legal characters
	private static boolean checkforLegalCh() throws InterruptedException
	{
		while(!isLegal)
		{
			isLegal = true;
			for (int i=0; i<userString.length(); i++)
			{
				if (!Character.isLetter(userString.charAt(i)) && !Character.isWhitespace(userString.charAt(i)))
				{
					isLegal = false;
					System.out.println("Please enter valid string");
					userString = read.nextLine();
				}
			}
		}
		isLegal = false;
		return isLegal;
	}
	//update the available choices by removing letter in legal characters
	private static void updateAvailableChoices(String removeLetter)
	{
		legalCharacters= legalCharacters.replace(removeLetter, " ");
	}
	//if game is over then there is no more ?
	private static void gameOver()
	{
		if(!answerString.contains("?"))
		{
			win = true;
			System.out.println("\n\n\n\n\n\n"+
			spaces+"Congratulations! You guessed it!");
		}
	}
	//checking if letter is in the original string
	private static boolean containChar(String letter)
	{
		if (userString.contains(letter))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	//finding the amount of ? to print out
	private static void answerString() throws InterruptedException
	{
		answerString = "";
		for (int i = 1; i<=lengthUserString; i++)
		{
			answerString = answerString + "?";
		}
	}
	private static String shouldIStayInLoop()
	{
		String choice;
		System.out.println(spaces + "Would you like to play this game again?");
		System.out.println(spaces + "    please enter yes or no  ");
		choice = scan.nextLine();
		return choice;
	}
}


