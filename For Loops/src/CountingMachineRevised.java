import java.util.Scanner;

public class CountingMachineRevised
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int t, f, b, c;
		System.out.print( "Count from: ");
		f = keyboard.nextInt();
		System.out.print( "Count to: ");
		t = keyboard.nextInt();
		System.out.print( "Count by: ");
		b = keyboard.nextInt();
		System.out.println("");
		for ( c = f ; c <= t ; c = c + b )
		{
			System.out.print(c + " " );
		}
	}

}