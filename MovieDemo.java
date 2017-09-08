package homework1;

public class MovieDemo
{
	public static void main(String[] args)
	{
		MovieClass m = new MovieClass();
		m.readMovieData();
		m.displayShowTime();
		m.displayRatingLength();
		m.displayStarAndName();
		m.displayReview();
		

		
		MovieClass n = new MovieClass();
		n.readMovieData();
		n.displayShowTime();
		n.displayRatingLength();
		n.displayStarAndName();
		n.displayReview();
	}
}
