package homework2;

//class that contains main
public class PseudoDemo
{
	//start of main method
	public static void main(String[] args)
	{
		//create objects to make array
		Satelite[] satellites = new Satelite[4];
		satellites[0] = new Satelite(20, 20, 20, 0);
		satellites[1] = new Satelite(20, 20, 20, 0);
		satellites[2] = new Satelite(20, 20, 20, 0);
		satellites[3] = new Satelite(20, 20, 20, 0);
		
		satellites[0].outputFunction();
		
		for(Satelite currentSatellite : satellites)
		{
			currentSatellite.readData();
			currentSatellite.calculatePR();
			currentSatellite.displayData();
			currentSatellite.displayPR();
		}
		
	}
	//end main method
}
//end class containing main method
