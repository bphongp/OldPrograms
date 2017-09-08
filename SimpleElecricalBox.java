package misc;

import java.util.Scanner;

public class SimpleElecricalBox 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int buildingNumber, electricalBoxes;
		
		System.out.println("Enter the number of buildings:");
		buildingNumber = scan.nextInt();
		//**allows user to input number of buildings**//
		System.out.println("Enter the number of boxes:");
		electricalBoxes = scan.nextInt();
		//**allows user to input number of boxes**//
		
		double BUILDING_CHARGE = 125;
		double ELECTRICAL_BOX_COST = 51;
		//**assigning the cost of building and boxes**//
		double buildingSum, boxSum, total;
		//**naming the double variables and constant needed for further calculations**//
		
		buildingSum = BUILDING_CHARGE * buildingNumber;
		boxSum = ELECTRICAL_BOX_COST * electricalBoxes;
		total = buildingSum + boxSum;
		//**some calculations to find total revenue**//
		
		System.out.print("The total charge if the building charge is 125 for " + buildingNumber);
		System.out.println(" buildings is: " + buildingSum);
		System.out.print("The total charge if the box cost is 51 for " + electricalBoxes);
		System.out.println(" boxes is: " + boxSum);
		System.out.println("Therefore the total revenue is : " + total);
		//**output of what the calculations done in English Language for user**//
	}
}



