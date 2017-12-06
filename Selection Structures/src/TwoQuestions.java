import java.util.Scanner;

public class TwoQuestions 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String q1, q2;
		
		System.out.println("TWO QUESTIONS");
		System.out.println("Think of something, and I'll try and guess what it is");
		System.out.println("");
		System.out.println("Question 1) Is it an animal, vegitable or mineral?");
		q1 = keyboard.next();
		System.out.println("Question 2) Is it bigger than a breadbox?");
		q2 = keyboard.next();
		if( q1.equals ("animal") && q2.equals ("no") )
		{
			System.out.println("Is it a squirrel?");
		}
		if( q1.equals ("animal") && q2.equals ("yes") )
		{
			System.out.println("Is it a moose?");
		}
		if( q1.equals ("vegetable") && q2.equals ("no") )
		{
			System.out.println("Is it a carrot?");
		}
		if( q1.equals ("vegetable") && q2.equals ("yes") )
		{
			System.out.println("Is it a watermelon?");
		}
		if( q1.equals ("mineral") && q2.equals ("no") )
		{
			System.out.println("Is it a paper clip?");
		}
		if( q1.equals ("mineral") && q2.equals ("yes") )
		{
			System.out.println("Is it a camaro?");
		}
	}
}