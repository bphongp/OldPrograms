package homework3;

//This program will manipulate a string that is entered by
//the user. 

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


//start of String class
public class StringFun
{
	private String str;
	private char eachChar, firstA;
	private int length, countLetters = 0, countNum = 0,
			countSpace=0, specCharCount = 0;
	
	//start of default constructor
	public StringFun()
	{
		
	}
	//end of default constructor
	
	//start of method that outputs what user should do next
	public void displayState()
	{
		System.out.println("This program will manipulate the string");
		System.out.println("that is entered. Please include numbers,");
		System.out.println("letters, and special characters.");
		System.out.println("Please enter at least 300 characters");
	}
	//end of method that outputs problem statement for user
	
	//start of read method that uses InputStreamReader 
	//& BufferedReader needs IOException
	public void readString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		str = br.readLine();
		System.out.println();
		System.out.println("The String You Entered is: ");
		System.out.println(str);
		System.out.println();
	}
	//end of read method
	
	//start method that manipulates string
	public void manipulateString()
	{
		//call private method to determine length
		determineLength();
		//call private method to count different character types 
		countCharTypes();
		//call private method to find positions of all 'a'
		positionsOfAs();
		//call private method to change first a to A in string
		atoCapitalA();
		//call private method to find positions of '$'
		positionsOf$();
		
	}
	//end of manipulateString method
	
	//start of method that determines length of string
	private void determineLength()
	{
		length = str.length();
		System.out.println("The length of the String is: "+length);
		System.out.println(str);
		System.out.println();
	}
	//end of method that determines length of string
	
	//start of method that counts different character types
	private void countCharTypes()
	{
		//loop will count the amount of each type of printable char
		for(int i = 0; i <str.length(); i++)
		{
			eachChar = str.charAt(i);
					
			if (Character.isLetter(eachChar))
				countLetters++;
			else if (Character.isDigit(eachChar))
				countNum++;
			else if(Character.isWhitespace(eachChar))
				countSpace++;
			else 
				specCharCount++;
		}
				
		System.out.println("Number of Letters in the String is: "
			+countLetters);
		System.out.println("Number of Digits in the String is: "
			+countNum);
		System.out.println("Number of special Chars in the"
			+ " String is: " +specCharCount);
	}
	//end of method that counts different character types
	
	//start method changing first a to A
	private void atoCapitalA()
	{
		StringBuffer sb = new StringBuffer(str);
		sb = sb.replace(str.indexOf('a'),str.indexOf('a')+1, "A");//replace a to A
		
		System.out.println("Replace first a to A we get: ");
		System.out.println(sb);
	}
	//end method changing first a to A
	
	//start method that finds all instances of 'a'
	private void positionsOfAs()
	{
		System.out.println("Positions of 'a' :");
		
		//use for loop to find all positions of a
		for(int j = -1; (j = str.indexOf('a', j+1))!= -1;)
		{
			System.out.println(j);
		}
	}
	//end method that finds all instances of 'a'
	
	//start method that finds positions of $
	private void positionsOf$()
	{
		//finds the char $ position after the 10th char
		int position$ = str.indexOf('$',10);
		System.out.println("The position of $ after the 10th character is:" 
				+position$);
		
		//finds the positions of every instance of $
		System.out.println("Positions of '$' :");
		for(int k = -1; (k = str.indexOf('$', k+1))!= -1;)
		{
			System.out.println(k);
		}
	}
	//end method that finds positions of $
}
//end of the string class
