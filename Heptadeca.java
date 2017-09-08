package misc;

import java.util.Scanner;
public class Heptadeca
{
	static Scanner read = new Scanner(System.in);
	private int decimalValue;
	String heptaString;
	Heptadeca()
	{
		
	}
	Heptadeca(String str)
	{
		heptaString = str;					
		str = str.substring(0, str.length()-1);	
		decimalValue = 0;
		for (int i = 0; i<str.length(); i++)
		{
			decimalValue = decimalValue *17;
			if(str.charAt(i)>='A' && str.charAt(i)<= 'G')
			{
				decimalValue = decimalValue + (str.charAt(i) - 'A'+10);				
			}
			else if (str.charAt(i)>= '0' && str.charAt(i)<= '9')
			{
				decimalValue = decimalValue + (str.charAt(i)-'0');
			}
		}
	}
	Heptadeca(int i)
	{
		decimalValue = i;
		int dValue = decimalValue;
		heptaString = "";
		while(dValue!=0)
		{
			if(dValue%17 < 10)
				heptaString = Integer.toString(dValue%17)+heptaString;
			else 
			{
				if(dValue%17 ==  10)
				{
					heptaString = "A"+heptaString;	
				}
				if(dValue%17 ==  11)
				{
					heptaString = "B"+heptaString;	
				}
				if(dValue%17 ==  12)
				{
					heptaString = "C"+heptaString;	
				}
				if(dValue%17 ==  13)
				{
					heptaString = "D"+heptaString;	
				}
				if(dValue%17 ==  14)
				{
					heptaString = "E"+heptaString;	
				}
				if(dValue%17 ==  15)
				{
					heptaString = "F"+heptaString;	
				}
				if(dValue%17 ==  16)
				{
					heptaString = "G"+heptaString;	
				}
			}
			dValue=dValue / 17;
		}
		if(heptaString.equals("") == false)
			heptaString = heptaString+"h";
		else
			heptaString = "0";
		
	}
	public Heptadeca get()
	{
		return this;
	}
	public void set(String str)
	{
		heptaString= str;
		decimalValue = 0;
		for (int i = 0; i<str.length(); i++)
		{
			decimalValue = decimalValue *17;
			if(str.charAt(i)>='A' && str.charAt(i)<= 'G')
			{
				decimalValue = decimalValue + (str.charAt(i) - 'A'+10);				
			}
			else if (str.charAt(i)>= '0' && str.charAt(i)<= '9')
			{
				decimalValue = decimalValue + (str.charAt(i)-'0');
			}
		}
	}
	public void set(int i)
	{
		decimalValue = i;
		int dValue = decimalValue;
		String heptaString = "";
		while(dValue>0 || dValue<0)
		{
			if(dValue%17 < 10)
				heptaString = Integer.toString(dValue%17)+heptaString;
			else 
			{
				if(dValue%17 ==  10)
				{
					heptaString = "A"+heptaString;	
				}
				if(dValue%17 ==  11)
				{
					heptaString = "B"+heptaString;	
				}
				if(dValue%17 ==  12)
				{
					heptaString = "C"+heptaString;	
				}
				if(dValue%17 ==  13)
				{
					heptaString = "D"+heptaString;	
				}
				if(dValue%17 ==  14)
				{
					heptaString = "E"+heptaString;	
				}
				if(dValue%17 ==  15)
				{
					heptaString = "F"+heptaString;	
				}
				if(dValue%17 ==  16)
				{
					heptaString = "G"+heptaString;	
				}
			}
			dValue= dValue / 17;
		}
	}
	private void checkLegal()
	{
		
	}
	public String toString()
	{
		return ""+heptaString;
	}
	public void set(Heptadeca h)
	{
		this.decimalValue = h.decimalValue;
		this.heptaString = h.heptaString;
	}
	
	public Heptadeca add(Heptadeca h)
	{
		int addHept = this.decimalValue + h.decimalValue;
		return new Heptadeca(addHept);	
	}
	public Heptadeca subtract(Heptadeca h)
	{
		int subHept =this.decimalValue -h.decimalValue;
		return new Heptadeca(subHept);
	}
	public Heptadeca multiply(Heptadeca h)
	{
		int multHept = this.decimalValue * h.decimalValue;
		return new Heptadeca(multHept);
	}
	public Heptadeca divide(Heptadeca h)
	{
		int divHept =this.decimalValue /h.decimalValue;
		return new Heptadeca(divHept);
	}
	public Heptadeca add(int i)
	{
		int addI =this.decimalValue +i;
		return new Heptadeca(addI);
	}
	public Heptadeca subtract(int i)
	{
		int subI = this.decimalValue - i;
		return new Heptadeca(subI);
	}
	public Heptadeca multiply(int i)
	{	
		int multI = this.decimalValue*i;
		return new Heptadeca(multI);
	}
	public Heptadeca divide(int i)
	{
		int divI =this.decimalValue/i;
		return new Heptadeca(divI);
	}
	public Heptadeca add(String str)
	{
		int addString = Integer.parseInt(str.substring(0,str.length()-1))+this.decimalValue;
		return new Heptadeca(addString);
	}
	public Heptadeca subtract(String str)
	{
		int subString = this.decimalValue- Integer.parseInt(str.substring(0, str.length()-1));
		return new Heptadeca(subString);
	}
	public Heptadeca multiply (String str)
	{
		int multString = Integer.parseInt(str.substring(0, str.length()-1))*this.decimalValue;
		return new Heptadeca(multString);
	}
	public Heptadeca divide(String str)
	{
		int divString = this.decimalValue/Integer.parseInt(str.substring(0, str.length() - 1));    
		return new Heptadeca(divString);
	}
	public boolean equals(Heptadeca heptadeca1)
	{
		if(this.decimalValue == heptadeca1.decimalValue)
			return true;
		else
			return false;
	}
}



