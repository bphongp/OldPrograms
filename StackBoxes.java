package gameMenu;

import java.util.Scanner;
public class StackBoxes 
{
	private static String spaces = "                     ";
	private static boolean gameNotDone = false;
	//private static scan = new Scanner(System.in);
	static Scanner read = new Scanner(System.in);
	private static Scanner scan = new Scanner(System.in);
	private static int implementChoice;
	private static String spaceforBox1 = "                         ";
	private static boolean box1 = true;
	private static boolean box2 = true;
	private static boolean box3 = true;
	private static boolean box4 = true;
	private static boolean box5 = true;
	private static boolean box6 = true;
	private static int randomNumbers;
	private static int amountOfBoxesUsed = 0;
	private static int count = 1;

	public static void stackBoxesMethod() throws InterruptedException
	{
		String choice = "Yes";
		while(choice.equalsIgnoreCase("Yes"))
		{
			introduction();
			generatingTheNums();
			choice = shouldIStayInLoop();
		}
	}
	
	private static int introduction()
	{
				System.out.println("" +
						"               Which version do you want?\n"+
						"               1) Watch trace.           \n" +
						"               2) Go directly to solution.\n" +
						"               Please choose 1 or 2.\n");
				implementChoice = scan.nextInt();
				while (implementChoice < 1 || implementChoice > 2)		
				{
					System.out.println("The number must be a 1 or 2");
					System.out.println("please enter a proper choice");
					implementChoice = scan.nextInt();
				}
				return implementChoice;
	}

	private static void generatingTheNums() throws InterruptedException
	{
		box1 = false;
		box2 = false;
		box3 = false;
		box4 = false;
		box5 = false;
		box6 = false;
		amountOfBoxesUsed = 0;
		
		while(!gameNotDone)
		{
			count = 0;	
			randomNumbers= (int)((Math.random() * 6) + 1); 
			amountOfBoxesUsed++;

			System.out.println("Boxes used so far: " +amountOfBoxesUsed);
			System.out.println("Current box number: " +randomNumbers);
			
			//reset box number if encountered already
			if (randomNumbers == 1) 
			{
				if (box1 == true) 
				{
					resetbox();
					count = 1;
				}
			}
			if (randomNumbers == 2) 
			{
				if (box2 == true) 
				{
					resetbox();
					count = 1;
				}
			}
			if (randomNumbers == 3) 
			{
				if (box3 == true) 
				{
					resetbox();
					count = 1;
				}
			}
			if (randomNumbers == 4) 
			{
				if (box4 == true) 
				{
					resetbox();
					count = 1;
				}
			}
			if (randomNumbers == 5) 
			{
				if (box5 == true) 
				{
					resetbox();
					count = 1;
				}
			}
			if (randomNumbers == 6) 
			{
				if (box6 == true) 
				{
					resetbox();
					count = 1;
				}
			}
			//amountOfBoxesUsed++;
			if (count == 0) 
			{
				if(implementChoice == 2)
					boxesOfSwitchSol();	
				else if(implementChoice == 1)
					boxesOfSwitchTrace();
			}
			
		}
	}
	private static void boxesOfSwitchTrace() throws InterruptedException
	{

		if(randomNumbers == 1)
			box1= true;
		if(randomNumbers == 2)
			box2 = true;
		if(randomNumbers == 3)
			box3 = true;
		if(randomNumbers == 4)
			box4 = true;
		if(randomNumbers == 5)
			box5 = true;
		if(randomNumbers == 6)
			box6 = true;
		switch(randomNumbers)
		{
			case 1 :
				box1Position();
				read.nextLine();
				break;
			case 2 :
				box2Position();
				read.nextLine();
				break;
			case 3 : 
				box3Position();
				read.nextLine();
				break;
			case 4 :
				box4Position();
				read.nextLine();
				break;
			case 5 :
				box5Position();
				read.nextLine();
				break;
			case 6 :
				box6Position();
				read.nextLine();
		}
	}
	private static void boxesOfSwitchSol() throws InterruptedException
	{
		if(randomNumbers == 1)
			box1= true;
		if(randomNumbers == 2)
			box2 = true;
		if(randomNumbers == 3)
			box3 = true;
		if(randomNumbers == 4)
			box4 = true;
		if(randomNumbers == 5)
			box5 = true;
		if(randomNumbers == 6)
			box6 = true;

		switch(randomNumbers)
		{
			case 1 :
				box1Position();
				break;
			case 2 :
				box2Position();
				break;
			case 3 : 
				box3Position();
				break;
			case 4 :
				box4Position();
				break;
			case 5 :
				box5Position();
				break;
			case 6 :
				box6Position();
		}
	}
	private static void box1Position() throws InterruptedException
	{
		if (box1 == true && box2==true && box3==false)
		{
			box1and2();
		}
		else if(box2 == false && box1 == true && box3 == false)
		{
			box1Alone();
		}
		else if (box1 = true && box2 == true && box3 == true && box5 == true)
		{
			box1235();
		}
		else if(box1=true && box2 == false && box3 ==true)
		{
			box1and3();
		}
		else if (box1 = true && box2 ==true && box3 ==true)
		{
			box123();
		}
		else
			resetbox();
	}
	private static void box2Position() throws InterruptedException
	{
		if (box2 == true && box1==false && box3==false)
		{
			box2Alone();
		}
		else if(box2 ==true && box1==true && box3==false)
		{
			box1and2();
		}
		else if(box2 = true && box1 == true && box3 == true && box5 == false && box4 ==false)
		{
			box123();
		}
		else if(box2 = true && box3 == true && box1 ==false)
		{
			box2and3();
		}
		else
			resetbox();
	}
	
	private static void box3Position() throws InterruptedException
	{
		if (box3 == true && box1==false && box2==false)
		{
			box3Alone();
		}
		else if(box3==true && box1 == true && box2 ==false)
		{
			box1and3();
		}
		else if(box3==true && box2==true && box1 ==false)
		{
			box2and3();
		}
		else if(box3 ==true && box2 == true && box1==true && box5 == false && box4 ==false)
		{
			box123();
		}
		else if(box3 ==true && box2 ==true && box1 ==true && box4 == true)
		{
			box1234();
		}
		else
			resetbox();
	}
	private static void box4Position() throws InterruptedException
	{
		if(box1==true && box2 == true && box3 == false && box4 == true)
		{
			box124();
		}
		else if(box1 == true && box2 == true && box3 == true && box4 == true && box5 == true)
		{
			box12345();
		}
		else if(box1 == true && box2 == true && box3 == true && box4 == true && box5 ==false)
		{
			box1234();
		}
		else
			resetbox();
	}
	private static void box5Position() throws InterruptedException
	{
		if(box1 == true && box2 == true && box3 == true && box4 == true && box5 == true)
		{
			box12345();
		}
		else if(box1 == false && box2 == true && box3 == true && box4 == false && box5 == true)
		{
			box235();
		}
		else if(box1 == true && box2 == true && box3 == true && box4 == false && box5 == true)
		{
			box1235();
		}
		else
			resetbox();
	}
	private static void box6Position() throws InterruptedException
	{
		if(box6 == true && box1 == true && box2 == true && box3 == true && box4 == true && box5 == true)
		{
			box123456();
		}
		else
			resetbox();

	}
	private static void box1Alone() throws InterruptedException
	{
		System.out.print(""
				+spaceforBox1+" _________\n"
				+spaceforBox1+"|         |\n"
				+spaceforBox1+"|    "+randomNumbers+ "    |\n" 
				+spaceforBox1+"|         |\n" 
				+spaceforBox1+"|_________|\n");
	}
	private static void box2Alone() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+"                 _________\n"
				+spaceforBox1+"                |         |\n"
				+spaceforBox1+"                |    "+randomNumbers+ "    |\n" 
				+spaceforBox1+"                |         |\n" 
				+spaceforBox1+"                |_________|\n");
	}
	private static void box3Alone() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+"                                 _________\n"
				+spaceforBox1+"                                |         |\n"
				+spaceforBox1+"                                |    3    |\n" 
				+spaceforBox1+"                                |         |\n" 
				+spaceforBox1+"                                |_________|\n");
	}
	private static void box1and2() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+" _________       _________\n"
				+spaceforBox1+"|         |     |         |\n"
				+spaceforBox1+"|    1    |     |    2    |\n" 
				+spaceforBox1+"|         |     |         |\n" 
				+spaceforBox1+"|_________|     |_________|\n");

	}
	private static void box1and3() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+" _________                       _________\n"
				+spaceforBox1+"|         |                     |         |\n"
				+spaceforBox1+"|    1    |                     |    3    |\n" 
				+spaceforBox1+"|         |                     |         |\n" 
				+spaceforBox1+"|_________|                     |_________|\n");
	}
	private static void box2and3() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+"                 _________       _________\n"
				+spaceforBox1+"                |         |     |         |\n"
				+spaceforBox1+"                |    2    |     |    3    |\n" 
				+spaceforBox1+"                |         |     |         |\n" 
				+spaceforBox1+"                |_________|     |_________|\n");
		
	}
	private static void box1235() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+"                         _________\n"
				+spaceforBox1+"                        |         |\n"
				+spaceforBox1+"                        |    5    |\n"
				+spaceforBox1+"                        |         |\n"
				+spaceforBox1+"                        |_________|\n"
				+spaceforBox1+" _________       _________       _________ \n"
				+spaceforBox1+"|         |     |         |     |         |\n"
				+spaceforBox1+"|    1    |     |    2    |     |    3    |\n" 
				+spaceforBox1+"|         |     |         |     |         |\n" 
				+spaceforBox1+"|_________|     |_________|     |_________|\n");
				
	}
	private static void box123() throws InterruptedException
	{
		System.out.print(""
				+spaceforBox1+" _________       _________       _________ \n"
				+spaceforBox1+"|         |     |         |     |         |\n"
				+spaceforBox1+"|    1    |     |    2    |     |    3    |\n" 
				+spaceforBox1+"|         |     |         |     |         |\n" 
				+spaceforBox1+"|_________|     |_________|     |_________|\n");
				
	}
	private static void box1234() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+"         _________\n"
				+spaceforBox1+"        |         |\n"
				+spaceforBox1+"        |    4    |\n"
				+spaceforBox1+"        |         |\n"
				+spaceforBox1+"        |_________|\n"
				+spaceforBox1+" _________       _________       _________ \n"
				+spaceforBox1+"|         |     |         |     |         |\n"
				+spaceforBox1+"|    1    |     |    2    |     |    3    |\n" 
				+spaceforBox1+"|         |     |         |     |         |\n" 
				+spaceforBox1+"|_________|     |_________|     |_________|\n");

	}
	private static void box124() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+"         _________\n"
				+spaceforBox1+"        |         |\n"
				+spaceforBox1+"        |    4    |\n"
				+spaceforBox1+"        |         |\n"
				+spaceforBox1+"        |_________|\n"
				+spaceforBox1+" _________       _________ \n"
				+spaceforBox1+"|         |     |         |\n"
				+spaceforBox1+"|    1    |     |    2    |\n" 
				+spaceforBox1+"|         |     |         |\n" 
				+spaceforBox1+"|_________|     |_________|\n");
	}
	private static void box12345() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+"         _________       _________\n"
				+spaceforBox1+"        |         |     |         |\n"
				+spaceforBox1+"        |    4    |     |    5    |\n"
				+spaceforBox1+"        |         |     |         |\n"
				+spaceforBox1+"        |_________|     |_________|\n"
				+spaceforBox1+" _________       _________       _________ \n"
				+spaceforBox1+"|         |     |         |     |         |\n"
				+spaceforBox1+"|    1    |     |    2    |     |    3    |\n" 
				+spaceforBox1+"|         |     |         |     |         |\n" 
				+spaceforBox1+"|_________|     |_________|     |_________|\n");

	}
	private static void box235() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+"                         _________\n"
				+spaceforBox1+"                        |         |\n"
				+spaceforBox1+"                        |    5    |\n"
				+spaceforBox1+"                        |         |\n"
				+spaceforBox1+"                        |_________|\n"
				+spaceforBox1+"                 _________       _________ \n"
				+spaceforBox1+"                |         |     |         |\n"
				+spaceforBox1+"                |    2    |     |    3    |\n" 
				+spaceforBox1+"                |         |     |         |\n" 
				+spaceforBox1+"                |_________|     |_________|\n");
	}
	private static void box123456() throws InterruptedException
	{
		System.out.print("" 
				+spaceforBox1+"                 _________ \n"
				+spaceforBox1+"                |         |\n"
				+spaceforBox1+"                |    6    |\n"
				+spaceforBox1+"                |         |\n"
				+spaceforBox1+"                |_________|\n"
				+spaceforBox1+"         _________       _________\n"
				+spaceforBox1+"        |         |     |         |\n"
				+spaceforBox1+"        |    4    |     |    5    |\n"
				+spaceforBox1+"        |         |     |         |\n"
				+spaceforBox1+"        |_________|     |_________|\n"
				+spaceforBox1+" _________       _________       _________ \n"
				+spaceforBox1+"|         |     |         |     |         |\n"
				+spaceforBox1+"|    1    |     |    2    |     |    3    |\n" 
				+spaceforBox1+"|         |     |         |     |         |\n" 
				+spaceforBox1+"|_________|     |_________|     |_________|\n");
				gameNotDone = true;
	}

	// resetbox method used to reset all boxes to false and empty pyramid
	private static void resetbox()
	{
		box1 = false;
		box2 = false;
		box3 = false;
		box4 = false;
		box5 = false;
		box6 = false;
	}
	private static String shouldIStayInLoop()
	{
		String choice;
		System.out.println(spaces + "Would you like to play this game again?");
		System.out.println(spaces + "    please enter yes or no  ");
		choice = read.nextLine();
		return choice;
	}
}



