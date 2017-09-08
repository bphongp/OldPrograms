package misc;

import java.util.Scanner;

public class CompareNonNegativeNumbers
{
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Please enter 3 non-negative integers:");
		String firstNumber = read.next();
		String secondNumber = read.next();
		String thirdNumber = read.next();

		int firstInt = Integer.parseInt(firstNumber);
		int secondInt = Integer.parseInt(secondNumber);
		int thirdInt = Integer.parseInt(thirdNumber);
		
		if (firstInt < secondInt && firstInt < thirdInt)
			if (secondInt < thirdInt)
				System.out.println("first entered:" +firstInt+ "<" +
				"second entered:"+secondInt+ "<" +"third entered:"+thirdInt);
			else
				System.out.println("first entered:"+firstInt + "<" + 
				"third enter:"+ thirdInt + "<" + "second entered:"+secondInt);
		if (secondInt < firstInt && secondInt < thirdInt)
			if (firstInt < thirdInt)
				System.out.println("second entered:"+secondInt + "<" +
				"first entered:"+firstInt + "<" + "third entered:" + thirdInt);
			else
				System.out.println("second entered:"+secondInt + "<" + 
				"third entered:"+thirdInt + "<" + "first entered:" +firstInt);
		if (thirdInt < firstInt && thirdInt < secondInt)
			if (firstInt < secondInt)
				System.out.println("third entered:"+thirdInt + "<" + 
				"first entered:"+ firstInt + "<" + "second entered:"+secondInt);
			else
				System.out.println("third entered:"+thirdInt + "<" + 
				"second entered:"+secondInt + "<" + "first entered:"+firstInt);
	}
}


