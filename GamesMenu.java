package gameMenu;

import java.util.Scanner;
public class GamesMenu
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String [] args) throws InterruptedException
	{
		int choiceNumber = 0;
		introduction();
		while(choiceNumber != 8)
		{
			printMenuChoices();
			choiceNumber = readChoiceNumber();
			switch (choiceNumber)
			{
			case 1:
				CoinFlipGame.coinFlipMethod();
				break;
			case 2:
				HighLowGuess.highLowGuessMethod();
				break;
			case 3:
				RaceNames.raceNamesMethod();
				break;
			case 4:
				DrawingShapes.drawingShapesMethod();
				break;
			case 5:
				GuessTheChar.guessTheCharMethod();
				break;
			case 6:
				StackBoxes.stackBoxesMethod();
				break;
			case 7:
				System.out.println("                     Thank you for learning the examples.");
				choiceNumber = 8;
				break;
			default:
				System.out.println("         Invalid choice.  The game is over.");
				choiceNumber = 8;
				break;
			}//switch

		}//while
	}
	private static void introduction()
	{
		System.out.println("\n\n" +
				"                   Ten empty lines are added.  This is useful.\n\n\n\n\n\n\n\n\n\n");
		System.out.println("" +
				"                   This program demonstrates the framework\n" +
				"                            of the games projects.\n"+
				"                      \n" );
	}
	private static void printMenuChoices()
	{
		System.out.println(""+
				"                   There are six game programs this menu offers.\n"
				+ "                      Which game would you like to play?\n"
				+ "                       Please enter the number\n"
				+ "                        1) Coin Flip Game. \n"
				+ "                        2) High Low Guess. \n"
				+ "                        3) Racing Names. \n"
				+ "                        4) Drawing Shapes. \n"
				+ "                        5) Guess The Character. \n"
				+ "                        6) Stack of Boxes.\n"
				+ "                        7) Quit playing these games. \n"
				+ "                      Please choose one of the seven choices.");

	}
	private static int readChoiceNumber()
	{
		int choiceNumber;
		String indent = "                   ";
		choiceNumber = scan.nextInt();
		while(choiceNumber < 1 || choiceNumber > 7)
		{
			System.out.println(indent + "the number must be 1 through 7 inclusive");
			System.out.println(indent + "    please enter a proper choice.  ");
			choiceNumber = scan.nextInt();
		}
		return choiceNumber;
	}
}


