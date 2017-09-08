package misc;

import java.util.Scanner;

public class FilterProfanity
{
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("This program will filter profanity");
		System.out.println("Let us consider cat as a profane word");
		System.out.println("Please enter a sentence: ");
		
		String sentence = read.nextLine();
		sentence = sentence.toLowerCase();
		boolean profane = false;
		//set the boolean to false initially
		
		//want to see if cat is in string by using index
		//if cat is in string then it would not be equal to -1
		if (sentence.indexOf("cat") != -1)
		{	
			int indexCat = sentence.indexOf("cat");
			//search first occurrence of cat
			int lastCat = sentence.lastIndexOf("cat");
			//search last occurrence of cat
			int lengthCat = "cat".length();
				
			if (indexCat == 0)
			//seeing if cat is in the beginning
			{
				//if length of cat is = to own length or 
				//character after index of cat = space
				//then that means that the boolean is true and cat_
				if (sentence.length() == lengthCat ||
					sentence.charAt(indexCat + lengthCat)==' ')
						{
							profane = true;
							System.out.println("Profane word at beginning of sentence.");
						}
			}
			//we need to find beginning character and test
			//if space before _cat
			else if(sentence.length() == lastCat+lengthCat && sentence.charAt(indexCat - 1)==' ')
				{
					profane = true;
					System.out.println("Profane word at the end of sentence.");
				}
			//get cat within sentence surrounded by spaces _cat_
			else if(sentence.charAt(indexCat - 1) == ' '
					&& sentence.charAt(indexCat + lengthCat) == ' ')
					{
						profane = true;
						System.out.println("Profane word in the middle of sentence.");
					}

		}
		else profane = false;
		if (profane)
			System.out.println("Your sentence contain some profane words");
		else
			System.out.println("Your sentence did NOT contain profane words");
	}
			
}



