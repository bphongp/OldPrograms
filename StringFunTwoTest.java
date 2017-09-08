package homework4;

import java.io.IOException;

//start of new class with main method
public class StringFunTwoTest
{
	//start of main method
	public static void main(String[] args)
	{
		StringFunTwo stringObj = new StringFunTwo();
		stringObj.displayState();
		
		try
		{
			stringObj.readString();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		stringObj.manipulateString();
	}
	//end of main method
}
//end of class 
