package gameMenu;

import java.util.Scanner;
import java.util.Random;
public class RaceNames
{
	private static int distanceAnnieRan = 0;
	private static int distanceChloeRan = 0;
	private static int distanceDavidRan = 0;
	private static String spaces = "                     ";
	//private static int characterstoMove;
	private static int totalLength = 77;
	static boolean raceIsDone = false;
	static Scanner read = new Scanner(System.in);
	//private static Scanner scan = new  Scanner(System.in);
	public static void raceNamesMethod() throws InterruptedException
	{
		introduction();
		String choice = "Yes";
		while(choice.equalsIgnoreCase("Yes"))
		{
			setStageforRace();
			System.out.println();
			
			racingTheNames();
			choice = shouldIStayInLoop();
		}
	}
	private static void racingTheNames() throws InterruptedException
	{
		while(!raceIsDone)
		{
			firstNameMovement();
			secondNameMovement();
			thirdNameMovement();
			if(distanceAnnieRan>=77)
			{
				System.out.println("\nAnnie Finished First!");
				//raceIsDone = true;
			}
			if(distanceChloeRan>=77)
			{
				System.out.println("\nChloe Finished First!");
				//raceIsDone= true;
			}
			if(distanceDavidRan>=77)
			{
				System.out.println("\nDavid Finished First!");
				//raceIsDone = true;
			}
		}
	}
	private static boolean firstNameMovement() throws InterruptedException
	{
		Random randomNumber = new Random();
		
		//while(!raceIsDone)
		{
			System.out.println("The Race Continues                                                         FINISH |");
			System.out.println("                                                                                  |");
			int characterstoMoveAnnie = randomNumber.nextInt(5);
			distanceAnnieRan = distanceAnnieRan + characterstoMoveAnnie;
			for(int i = 0; i < distanceAnnieRan ; i++)
			{
				System.out.print(" ");
			}
			System.out.print("Annie");
			Thread.sleep(100);
			for(int i = 0; i < (totalLength - distanceAnnieRan); i++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			if(distanceAnnieRan>=77)
			{
				//System.out.println("\nAnnie Finished First!");
				raceIsDone = true;
			}
			System.out.println();
		}
		return raceIsDone;
	}
	private static boolean secondNameMovement() throws InterruptedException
	{
		Random randomNumber = new Random();
		//while(!raceIsDone)
		{
			int characterstoMove = randomNumber.nextInt(5);
			distanceChloeRan = distanceChloeRan + characterstoMove;
			//spaces before the name
			for(int i = 0; i < distanceChloeRan ; i++)
			{
				System.out.print(" ");
			}
			System.out.print("Chloe");
			Thread.sleep(100);
			//spaces after the name
			for(int i = 0; i < (totalLength - distanceChloeRan); i++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			if(distanceChloeRan>=77)
			{
				//System.out.println("\nChloe Finished First!");
				raceIsDone= true;
			}
			System.out.println();
		}
		return raceIsDone;
	}
	private static boolean thirdNameMovement() throws InterruptedException
	{
		Random randomNumber = new Random();
		
		//while(!raceIsDone)
		{
			int characterstoMove = randomNumber.nextInt(5);
			distanceDavidRan = distanceDavidRan + characterstoMove;
			for(int i = 0; i < distanceDavidRan ; i++)
			{
				System.out.print(" ");
			}
			System.out.print("David");
			Thread.sleep(100);
			for(int i = 0; i < (totalLength - distanceDavidRan); i++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
			if(distanceDavidRan>=77)
			{
				//System.out.println("\nDavid Wins!");
				raceIsDone = true;
			}
			System.out.println();
			System.out.println("\n\n\n\n\n\n\n\n\n");
		}
		return raceIsDone;
	}
	private static void introduction() throws InterruptedException
	{
		System.out.println("" +
				"                   This game races three names. The random number generator\n"+
				"                   from the Math class repeatedly gives each name a random number\n" +
				"                   between 1 and 5. As the names move these random distances\n" +
				"                   we see which name get to the finish line first."+
				"                   Please press enter to begin the race.");
		read.nextLine();
	}
	private static void setStageforRace() throws InterruptedException
	{
		System.out.println("The Race Begins                                                            FINISH |");
		System.out.println("                                                                                  |");
		System.out.println("Annie                                                                             |");
		System.out.println("Chloe                                                                             |");
		System.out.println("David                                                                             |");
		System.out.println();
		System.out.println();
	}

	private static String shouldIStayInLoop()
	{
		String choice;
		System.out.println(spaces + "Would you like to play this game again?");
		System.out.println(spaces + "       please enter yes or no  ");
		choice = read.nextLine();
		return choice;
	}
}



