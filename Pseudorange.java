package homework2;

import java.util.Scanner;

//This program will calculate the pseudorange
//of four satellites given the receiver time, broadcast time,
//and ID of the satellites

//class reading id, receiver time, and broadcast time
public abstract class Pseudorange implements Comparable<Satelite>
{
	//private variables
	private int id1;
	private double bcTime1, rTime1;
	
	//constructor to pass arguments
	public Pseudorange(int id1, double bcTime1, double rTime1)
	{
		if(id1 < 0)
			throw new IllegalArgumentException("cannot be negative");
		else
			this.id1 = id1;
		if(bcTime1 <0)
			throw new IllegalArgumentException("cannot be negative");
		else 
			this.bcTime1 = bcTime1;
		if(rTime1<0)
			throw new IllegalArgumentException("cannot be negative");
		else
			this.rTime1 = rTime1;
	}
	//end constructor passing arguments
	
	//default constructor
	public Pseudorange()
	{
		
	}
	//end default constructor
	
	//start method set ID of satellite and throw exception if negative
	public void setID(int id1)
	{
		if(id1 < 0)
			throw new IllegalArgumentException("cannot be negative");
		else
			this.id1 = id1;
	}
	//end method of set ID
	
	//start method set broadcast time and throw exception if negative
	public void setBCTime(double bcTime1)
	{
		if(bcTime1 < 0)
			throw new IllegalArgumentException("cannot be negative");
		else
			this.bcTime1 = bcTime1;
	}
	//end method of set broadcast time
	
	//start method set receiver time and throw exception if negative
	public void setRTime(double rTime1)
	{
		if(rTime1 < 0)
			throw new IllegalArgumentException("cannot be negative");
		else
			this.rTime1 = rTime1;
	}
	//end method of set receiver time
	
	//start of get method of ID that returns integer
	public int getID()
	{
		return id1;
	}
	//end of get method of ID
	
	//start of get method of receiver time that returns double
	public double getRTime()
	{
		return rTime1;
	}
	//end of get method for receiver time
	
	//start of get method of broadcast time that returns double
	public double getBCTime()
	{
		return bcTime1;
	}
	//end of get method for broadcast time
	
	//method that output what program does for user
	public void outputFunction()
	{
		System.out.println("This Program will calculate the pseudorange");
		System.out.println("of four satellites given the receiver time,");
		System.out.println("broadcast time, and ID of the satellites");
		System.out.println();
	}
	//end of output method
	
	//start of read data method that reads input from user
	public void readData()
	{
		Scanner read =  new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		setID(read.nextInt());
		System.out.println("Enter Broadcast Time(microseconds): ");
		setBCTime(read.nextDouble());
		setBCTime(bcTime1/1000000);//converts from microseconds to sec
		System.out.println("Enter Receiver Time(seconds): ");
		setRTime(read.nextDouble());
	}
	//end of read data method
	
	//method that outputs the data user entered
	public void displayData()
	{
		System.out.println("ID: "+id1);
		System.out.println("Broadcast Time: "+bcTime1+"s");
		System.out.println("Receiver Time: "+rTime1+"s");
	}
	//end method that outputs the data user entered
	/**public int compareTo(Object a)
		{
			final int LESS = -1;
			final int EQUAL = 0;
			final int GREATER = 1;
			
			if (this == a) return EQUAL;
			
			if(this.pseudo < a.pseudo) return LESS;
			if(this.pseudo > a.pseudo) return GREATER;
			
		}**/
}
//end of class
