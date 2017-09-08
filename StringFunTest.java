package homework3;

import java.io.IOException;

//start of new class with main method
public class StringFunTest
{
	//start of main method
	public static void main(String[] args)
	{
		StringFun stringObj = new StringFun();
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