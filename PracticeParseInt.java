package misc;

import java.util.Scanner;

public class PracticeParseInt
{
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String number, b0, b1, b2, b3;
		
		System.out.println("Please enter a 4-bit binary number");
		number = read.nextLine();
		
		b0 = number.substring(0,1);
		//System.out.println(b0);
		b1 = number.substring(1,2);
		//System.out.println(b1);
		b2 = number.substring(2,3);
		//System.out.println(b2);
		b3 = number.substring(3);
		//System.out.println(b3);
		
		int bin0 = Integer.parseInt(b0);
		int bin1 = Integer.parseInt(b1);
		int bin2 = Integer.parseInt(b2);
		int bin3 = Integer.parseInt(b3);
		
		bin0 = 8 * bin0;
		bin1 = 4 * bin1;
		bin2 = 2 * bin2;
		
		int answer = bin0 + bin1 + bin2 + bin3;
		
		System.out.println("The decimal equivalent is: ");
		System.out.println(answer);
	}

}


