package homework2;

//class that calculates the pseudorange and extends other class
public class Satelite extends Pseudorange
{
	private double pseudo;
	private static final double SPEED_LIGHT = 299792458;
	
	//start of constructor passing arguments
	public Satelite(int id1, double bcTime1, double rTime1,double pseudo)
	{
		super(id1, bcTime1, rTime1);
		
		if (pseudo<0)
			throw new IllegalArgumentException("cannot be negative");
		else
			this.pseudo = pseudo;
	}
	//end of constructor passing arguments
	
	//start method set pseudorange
	public void setP(double pseudo)
	{
		pseudo = (getRTime() - getBCTime())*SPEED_LIGHT;
		if(pseudo>this.pseudo)
		{
			System.out.println(+this.pseudo);
			System.out.println("This pseudorange is closer "+pseudo);
		}
		if (pseudo<0)
			throw new IllegalArgumentException("cannot be negative");
		else
			this.pseudo = pseudo;
	}
	//end method set pseudorange
	
	//start method calculate pseudorange
	public void calculatePR()
	{
		//get the time entered from other class
		pseudo = (getRTime() - getBCTime())*SPEED_LIGHT;
			
	}
	//end method calculate pseudorange

	//start display the pseudorange
	public void displayPR()
	{
		System.out.println("Pseudorange: "+pseudo+"m");
	}
	//end method display the pseudorange
}
