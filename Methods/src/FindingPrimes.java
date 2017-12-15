import java.util.Scanner;

public class FindingPrimes 
	{
		public static void main( String[] args )
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("We are going to find some Primes!");
			System.out.println("What range would you like them in?");
			System.out.println("(only posative integers 2 or greater)");
			
			System.out.print("low end: ");
			int l = keyboard.nextInt();
			
			
			System.out.print("high end: ");
			int h = keyboard.nextInt();
			
			for ( int n = l; n <= h ; n = n + 1 )
			{
					System.out.println(n);
				
			}
		}
	}
