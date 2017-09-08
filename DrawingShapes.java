package gameMenu;

import java.util.Scanner;
public class DrawingShapes
{
	
	private static String spaces = "                     ";
	private static Scanner scan = new  Scanner(System.in);
	static Scanner read = new Scanner(System.in);
	public static void drawingShapesMethod() throws InterruptedException
	{
		String choice = "Yes";
		while(choice.equalsIgnoreCase("Yes"))
		{

			int choiceNumber = 0;
			while(choiceNumber != 6)
			{
				introduction();
				printMenuDrawingChoices();
				choiceNumber = readChoiceNumber();
				switch (choiceNumber)
				{
				case 1:
					triangleDrawing();
					break;
				case 2:
					diamondDrawing();
					break;
				case 3:
					trapezoidDrawing();
					break;
				case 4:
					DrawingShapes.drawingShapesMethod();
					break;
				case 5:
					pineTree();
					break;
				default:
					System.out.println("         Invalid choice.  The game is over.");
					choiceNumber = 6;
					break;
				}//switch

			}//while
			
			choice = shouldIStayInLoop();
		}
	}
	private static void introduction() throws InterruptedException
	{
		System.out.println("" +
				"                   This game draws geometric shapes.");
	}

	private static String shouldIStayInLoop()
	{
		String choice;
		System.out.println(spaces + "Would you like to play this game again?");
		System.out.println(spaces + "    please enter yes or no  ");
		choice = scan.nextLine();
		return choice;
	}
	private static void printMenuDrawingChoices()
	{
		System.out.println(""+
				"                   Which shape would you like to draw?\n"
				+ "                       Please enter the number\n"
				+ "                        1) Triangle. \n"
				+ "                        2) Diamond. \n"
				+ "                        3) Trapezoid. \n"
				+ "                        4) Parallelogram. \n"
				+ "                        5) Pine Tree. \n");

	}
	private static int readChoiceNumber()
	{
		int choiceNumber;
		String indent = "                   ";
		choiceNumber = scan.nextInt();
		while(choiceNumber < 1 || choiceNumber > 6)
		{
			System.out.println(indent + "the number must be 1 through 5 inclusive");
			System.out.println(indent + "    please enter a proper choice.  ");
			choiceNumber = scan.nextInt();
		}
		return choiceNumber;
	}
	private static void triangleDrawing() throws InterruptedException
	{
		System.out.println("How many lines would you like in the Triangle");
		int enteredInteger= read.nextInt();
		int row, column;

        System.out.println();
        for (row=0; row<enteredInteger; row++)
		{
			// Draw the spaces before *
			for (column=0; enteredInteger-row>column; column++)
			{
				System.out.print(" ");
			}
			
			// Draw the asterisks for each row
			for (column=0; 2*row+1>column; column++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
        System.out.println();
		System.out.println();
	}

	private static void diamondDrawing() throws InterruptedException
	{
		System.out.println("How many lines would you like in the Diamond");
		int enteredInteger = read.nextInt();
		int row, column;

        System.out.println();
		//top
		for(row= 1; row < enteredInteger; row+=2)
		{
			for(column = 0; (enteredInteger-1)-row/2 > column; column++)
			{
				System.out.print(" ");
			}
			for(column = 0; row > column; column++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	//bottom including the largest line
		if (enteredInteger%2==0)
		{
			for(row = enteredInteger +1 ;row > 0;  row-=2)
				//added 1 to enterednumber bc of the largest row
				{
					for(column = 0; (enteredInteger-1)-row/2 > column;column++)
					{
						System.out.print(" ");
					}
					for(column = 0; column<row; column++)
					{
						System.out.print("*");
					}
					System.out.print("\n");
				}
				System.out.println();
				System.out.println();
		}
		else
		{
			for(row = enteredInteger ;row > 0;  row-=2)
				//added 1 to enterednumber bc of the largest row
				{
					for(column = 0; (enteredInteger-1)-row/2 > column;column++)
					{
						System.out.print(" ");
					}
					for(column = 0; column<row; column++)
					{
						System.out.print("*");
					}
					System.out.print("\n");
				}
				System.out.println();
				System.out.println();
		}
	}
	private static void trapezoidDrawing() throws InterruptedException
	{
		System.out.println("How many characters wide would you like the trapezoid?");
		int widthOfTrap = read.nextInt();
		System.out.println("How many lines would you like in the trapezoid?");
		int linesOfTrap = read.nextInt();
		int numberColumns, numberRows;

		int i, j;

        for (numberColumns = linesOfTrap; numberColumns <=widthOfTrap; numberColumns++)
        {
            for (numberRows = 1; numberRows <= (12 - numberColumns); numberRows++)
                 System.out.print(" ");
            for (numberRows = 1; numberRows<= numberColumns; numberRows++)
                 System.out.print("*");
            for (numberRows = (numberColumns - 1); numberRows >= 1; numberRows--)
                 System.out.print("*");
            System.out.println("");

        }       

      }
	private static void pineTree() throws InterruptedException
	{
		  for (int i = 0; i < 10; i++) {
		   for (int j = 0; j < 10 - i; j++)
		    System.out.print(" ");
		   for (int k = 0; k < (2 * i + 1); k++)
		    System.out.print("*");
		   System.out.println();
		  }
		 }
	}




