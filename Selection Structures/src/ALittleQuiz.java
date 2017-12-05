import java.util.Scanner;

public class ALittleQuiz 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int qa, qb, qc;
		
		System.out.println("Q1) What is the capitol of Alaska?");
		System.out.println("     1) Melbourne");
		System.out.println("     2) Anchorage");
		System.out.println("     3) Juneau");
		System.out.println("");
		System.out.print(">");
		qa = keyboard.nextInt();
		if( qa == 3 )
		{
			System.out.println("That's right!");
			System.out.println("");
		}
		else
		{
			System.out.println("Sorry, the capitol is Juneau");
			System.out.println("");
		}
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("     1) yes");
		System.out.println("     2) no");
		System.out.println("");
		System.out.print(">");
		qb = keyboard.nextInt();
		if( qb == 2 )
		{
			System.out.println("That's right!");
			System.out.println("");
		}
		else
		{
			System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
			System.out.println("");
		}
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("     1) 5");
		System.out.println("     2) 11");
		System.out.println("     3) 15/3");
		System.out.println("");
		System.out.print(">");
		qc = keyboard.nextInt();
		if( qc == 2 )
		{
			System.out.println("That's right!");
			System.out.println("");
		}
		else
		{
			System.out.println("Sorry, the answer is 11");
			System.out.println("");
		}
		if(qa == 3 && qb == 2 && qc == 2)
		{
			System.out.println("Overall, you got 3 out of 3 correct.");
			System.out.println("Thanks for playing!");
		}
		else if(qb == 2 && qc == 2 || qa == 3 && qc == 2 || qa == 3 && qb == 2)
		{
			System.out.println("Overall, you got 2 out of 3 correct.");
			System.out.println("Thanks for playing!");
		}
		else if(qb == 2 || qa == 3 || qc == 2 )
		{
			System.out.println("Overall, you got 1 out of 3 correct.");
			System.out.println("Thanks for playing!");
		}	
		else
		{
			System.out.println("Overall, you got 0 out of 3 correct.");
			System.out.println("Thanks for playing!");
		}
	}
}