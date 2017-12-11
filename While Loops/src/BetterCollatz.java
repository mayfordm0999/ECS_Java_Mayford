import java.util.Scanner;

public class BetterCollatz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int n, c = 1;
		System.out.println("Let's create a COLLAT SEQUENCE! ");
		System.out.println("RULES:");
		System.out.println("If the number is even, divide it by two. ");
		System.out.println("If the number is odd, Multiply by 3 and add 1.");
		System.out.println("Repeat this decision until you reach 1");
		System.out.print("Starting number:");
		n = keyboard.nextInt();
		System.out.print("[ " + n + " - ");
		do
		{
			if(n % 2 == 0)
			{
				n = n/2;
				System.out.print( n + " - ");
			}
			else if(n % 2 != 0)
				n = n*3 + 1;
				System.out.print( n + " - ");
			    c++;
		} while(n > 1);
		System.out.println("]");
		System.out.println("Terminated after " + c + " steps"); 

	} 

}
