
import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int a, c = 0;
		
		
		System.out.print( "Number: " );
		a = keyboard.nextInt();
		System.out.println();
		
		for ( int i = 1; i <= a; i++ )
		{
			c += i;
			System.out.print( i + " " );
		}
		System.out.println(" ");
		System.out.println( "The sum is " + c + "." );
	}
}