import java.util.Scanner;

public class CountingMachine 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int n, c ;
		System.out.print( "Count to: ");
		n = keyboard.nextInt();
		
		for ( c = 0 ; c <= n ; c = c + 1 )
		{
			System.out.print(c + " " );
		}
	}

}
