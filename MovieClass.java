package homework1;

import java.util.Scanner;

public class MovieClass
{
	Scanner read = new Scanner(System.in);
	private String title, rating, star;
	private Time showTime, length;
	private double review;
	
	public MovieClass(String title, String rating, String star,
			double review, Time showTime, Time length)
	{
		if(review<0 || review> 5)
			throw new IllegalArgumentException("review must be out of 5 stars");
		else
			this.review = review;
		
		if(rating.equalsIgnoreCase("G") || rating.equalsIgnoreCase("PG")
				|| rating.equalsIgnoreCase("PG13")|| rating.equalsIgnoreCase("R")
				|| rating.equalsIgnoreCase("NC17"))
			this.rating = rating;
		else
			throw new IllegalArgumentException("Not acceptable ratings");
		
		this.length = length;
		this.showTime = showTime;
		this.title = title;
		this.star = star;
		this.showTime = showTime;
	}
	public MovieClass()
	{
		
	}
	public void setShowTime(Time showTime)
	{
		this.showTime = showTime;
	}
	public void setStar(String star)
	{
		this.star = star;
	}
	public void setName(String title)
	{
		this.title = title;
	}
	public void setRating(String rating)
	{
		if(rating.equalsIgnoreCase("G") || rating.equalsIgnoreCase("PG")
				|| rating.equalsIgnoreCase("PG13")|| rating.equalsIgnoreCase("R")
				|| rating.equalsIgnoreCase("NC17"))
		{
			this.rating = rating;
		}
		else
			throw new IllegalArgumentException("Not acceptable ratings");
	}
	public void setLike(double review)
	{
		if(review<0 || review> 5)
			throw new IllegalArgumentException("review must be out of 5 stars");
		this.review = review;
	}
	public void setLength(Time length)
	{
		this.length = length;
	}

	public void displayShowTime()
	{
		System.out.println("Show time "+showTime);
	}
	public void displayStarAndName()
	{
		System.out.printf("%s stars in %s %n", star,title);
	}
	public void displayRatingLength()
	{
		System.out.printf("Rated %s, Duration %s%n", rating,
				length.toUniversalString());
	}
	public void displayReview()
	{
		System.out.printf("Review: %.1f out of 5%n%n", review);
	}
	public void readMovieData()
	{
		System.out.println("Show Time(enter as 24 hrs)");
		Time t = new Time();
		t.readTime();
		setShowTime(t);
		
		System.out.println("Movie Title: ");
		setName(read.nextLine());
		
		System.out.println("Rated (G, PG, PG13, R, NC17): ");
		setRating(read.nextLine().toUpperCase());
		
		System.out.println("Review (out of 5 stars): ");
		setLike(read.nextDouble());
		
		System.out.println("Length: ");
		Time l = new Time();
		l.readTime();
		setLength(l);
		
		read.nextLine();
		System.out.println("Star: ");
		setStar(read.nextLine());
	}
}
