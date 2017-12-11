import java.util.Random;
import java.util.Scanner;

public class HiLowLimited 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int num = 1 + r.nextInt(100), ans, n = 0;
		
		System.out.println("I'm thinking of a number from 1 to 100, you have 7 guesses");
		System.out.print(">");
		ans = keyboard.nextInt();
		
		while ( n < 6 )
		{
			if( num == ans )
			{
				System.out.println("You guessed it! What are the odds?");
			}
			else if (num < ans)
			{
				System.out.println("Sorry too high");
			}
			else if (num > ans)
			{
				System.out.println("Sorry too low");
			}
			System.out.print(">");
			ans = keyboard.nextInt();
			n++;
		}
		if( n == 6 )
		{
			System.out.println("Sorry, you couldn't guess it in 7 tries, you loose");
		}
		
	}
}

