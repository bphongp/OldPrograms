package misc;

import java.util.Scanner;

public class PracticeStringManipulations
{
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args)
	{		
		System.out.println("Enter a line of text. No punctuation please.");
		
		
		String firstWord = read.next();
		//reads the first word before space not including space
		//**System.out.println(firstWord);
		String text = read.nextLine();
		//reads the rest after the first scanned including space
		//**System.out.println(text);
		String textNoSpace = text.trim();
		//trims the string so there's no space
		//**System.out.println(textNoSpace);
		
		String ch1 = "" + textNoSpace.charAt(0);//reads index 0
		ch1 = ch1.toUpperCase();//changes the index 0 to upper case
		//**System.out.println(ch1);
		
		textNoSpace = ch1 + textNoSpace.substring(1);
		//combines Upper case to text starting with index 1 onwards
		
		System.out.println("I have rephrased that line to read:");
		System.out.println(textNoSpace + " " + firstWord);

	}

}



