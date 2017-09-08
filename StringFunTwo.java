package homework4;

//this program manipulates a string the user enters
//by the help of string buffers

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StringFunTwo
{
	private String str, myName = "BAMPHIANE", userWords, userName;
	private int eachChar;
	private int count = 0;
	private StringBuffer sb;
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader (isr);

	//start of default constructor
	public StringFunTwo()
	{
		
	}
	//end of default constructor
	
	//start of method that outputs problem statement for user
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
		str = br.readLine();
		System.out.println();
		System.out.println("\nThe String You Entered is: ");
		System.out.println(str +"\n");
		System.out.println();
		sb = new StringBuffer(str);
	}
	//end of read method
	
	//start method that manipulates string
	public void manipulateString()
	{
		positionsOf$();
		deleteSpecChar();
		upperFirstEachWord();
		onlyOneUpperFirstLine();
		myNameAdded();
			try
			{
				userEnterText();
				userName();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
	}
	//end method manipulates string
	
	//start method that finds positions of $
	private void positionsOf$()
	{	
		//finds the positions of every instance of $
		for(int k = -1; (k = str.indexOf('$', k+1))!= -1;)
		{
			sb = sb.replace(k,k+1,"#");//replaces $ to # at each instance
		}
		str = String.valueOf(sb);//convert StringBuffer to string
		System.out.println("Change the $ to # we get: ");
		System.out.println(str);
	}
	//end method that finds positions of $
	
	//start method delete special char except spaces and .
	private void deleteSpecChar()
	{
		//loop will count the amount of each type of printable char
		for(int i = 0; i <sb.length(); i++)
		{
			eachChar = sb.charAt(i);
			
			//if statement to keep letters, digits, white space & period
			if (Character.isLetter(eachChar) || Character.isDigit(eachChar) 
					|| Character.isWhitespace(eachChar) || eachChar == '.')
				count++;
			else 
			{
				sb.deleteCharAt(i);
				i--;//reduce length of string b/c deleting special char
			}
		}//end for loop
		str = sb.toString();
		System.out.println("\nDelete all special char aside "
				+ "from spaces and periods\n"+str);
	}//end delete special char method
	
	//start method change first char of every word to upper case
	private void upperFirstEachWord()
	{
		//convert string to a char array
		char[] charArray = str.toCharArray();
		//upper case first letter
		charArray[0] = Character.toUpperCase(charArray[0]);
		
		//upper case all letters after a white space is found
		for(int i = 1; i<charArray.length; i++)
		{
			if(Character.isWhitespace(charArray[i-1]))
				charArray[i]=Character.toUpperCase(charArray[i]);
		}
		//convert charArray back to string
		str= new String(charArray);
		System.out.println("\nChange first letter to uppercase of each word\n"+str);
	}
	//end method first char
	
	//start method first line to lower case except the first letter
	private void onlyOneUpperFirstLine()
	{
		int firstPeriod = str.indexOf('.');//find index of first '.'
		//create substring to from 2nd letter to instance of '.'
		String newSubStr = str.substring(1, firstPeriod);
		//make it all lower case
		newSubStr = newSubStr.toLowerCase();
		
		//create new string buffer to use replace method
		sb = new StringBuffer(str);
		
		sb.replace(1, firstPeriod, newSubStr);//replace with substring created

		str = sb.toString();
		System.out.println("\nChange first line to lower case except for "
				+"first letter\n" +str);
	}
	//end method first line to lowercase
	
	//start method insert name and add to end of last line
	private void myNameAdded()
	{
		sb.append(myName);//add name to last line
		str = sb.toString();
		System.out.println("\nAdd my name to the end of the last line\n"+str);
	}
	//end method insert my name
	
	//start method to ask to enter a new text and add to the end of document
	private void userEnterText() throws IOException
	{
		System.out.println("\nPlease enter at least five words:");
		userWords = br.readLine();
		
		sb.append(userWords);//add name to the end of text
		str= sb.toString();
		System.out.println("\nAdd your input the end of the document\n"+str);
	}
	//end method new text to end of document
	
	//start method user enters name and compare
	private void userName() throws IOException
	{
		System.out.println("\nPlease enter your name: ");
		userName = br.readLine();
		
		//compares the lengths of the names
		if (userName.length() < myName.length())
			System.out.println("Your name has less characters than mine");
		else if (userName.length() > myName.length())
			System.out.println("Your name has more characters than mine");
		else
			System.out.println("Your name has number of characters as mine");
	}
	//end of method that compares names
}
