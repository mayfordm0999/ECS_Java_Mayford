import java.util.Random;
import java.util.Scanner;

public class HILow 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int num = 1 + r.nextInt(100), ans;
		
		System.out.println("I'm thinking of a number from 1 to 100, try and guess it.");
		System.out.print(">");
		ans = keyboard.nextInt();
		
		if( num == ans )
		{
			System.out.println("You guessed it! What are the odds?");
		}
		else if (num < ans)
		{
			System.out.println("Sorry too high, I was thinking of " + num);
		}
		else if (num > ans)
		{
			System.out.println("Sorry too low, I was thinking of " + num);
		}
		
	}

}
