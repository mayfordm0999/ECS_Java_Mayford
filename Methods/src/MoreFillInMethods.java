// More Fill-In Methods - Fix the broken methods and method calls (again).

import java.util.Scanner;

public class MoreFillInMethods
{
	public static void main( String[] args )
	{
		// Fill in the method calls where indicated.
		System.out.println("Here we go.");
		superrand();
		stepcount();
		project_grade(4,3,4,5,2,1);
		get_name();
		crash();
	}

	private static void crash() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Do you feel lucky, punk?");
		String magic_word;
		if ( (int)(Math.random()*10) == 0 )
		{
			// What do you know?  We won!
			magic_word = "win";
		}
		else
		{
			// No big suprise; we lost.
			magic_word = "lose";
		}

		System.out.print("you " + magic_word);
	}

	private static void project_grade(int p1, int p2, int p3, int p4, int p5, int p6) {
		// TODO Auto-generated method stub
		int overall_grade;
		overall_grade = p1 * 6;    // six points per point for the first category
		overall_grade = overall_grade + ( p2 * 6 );   // six points per point
		overall_grade = overall_grade + ( p3 * 4 );   // four points per point
		overall_grade = overall_grade + ( p4 * 2 );   // two points per point
		overall_grade = overall_grade + ( p5 * 1 );   // one point per point
		overall_grade = overall_grade + ( p6 * 1 );   // one point per point
		System.out.println();
		System.out.println("Let's figure a project grade.");
		System.out.println( p1 + "" + p2 + "" + p3 + ""+ p4 +"" + p5 + ""+ p6 +" -> " + overall_grade );
	}

	private static void get_name() {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String name;
		System.out.println();
		System.out.print("Finally, some easy ones. Please enter your name: ");
		name = keyboard.next();
		System.out.println("Hi, " + name );
	}

	private static void stepcount() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.print("More counting, but this time not by ones: ");
		for( int n = 2; n <= 10; n = n + 2 )
        {
        	System.out.print( n + " " );
        }
		for( int n = 8; n >= 2; n = n - 2 )
        {
        	System.out.print( n + " " );
        }
	}

	private static void superrand() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Some random numbers, if you please: ");
		int  val1, val2;
		val1 = (int)(Math.random()*10);
		val2 = (int)(Math.random()*10);
		System.out.println("First: " + val1 );
		System.out.println("Second: " + val2 );
		if ( val1 == val2 )
			System.out.println("Hey!  They were the same!");
		else
			System.out.println("They were not the same.");

	}


/*
	public static ???? superrand( ???? )
	// Parameters are:
	//	int a;
	//	int b;
	{
		// picks a number between a and b, no matter which is larger
		int c;

		if ( a < b )	// b is larger
			c = a + (int)(Math.random()*(b-a+1));
		else if ( a > b )	// a is larger
			c = b + (int)(Math.random()*(a-b+1));
		else
			c = a;	// or c = b; doesn't matter since they're equal

		return ??;
	}
*/


/*
 	public static ???? stepcount( ???? )
	// Parameters are:
	//     int first;
	//     int last;
	//     int step;
	{
		// counts from 'first' to 'last' by 'step'
		// handles forward and backward
		int x;

		if ( first < last )
		{
			x = first;
			while ( x <= last )
			{
				System.out.print(x + " ");
				x = x + step;
			}
		}
		else
		{
			x = first;
			while ( x >= last )
			{
				System.out.print(x + " ");
				x = x - step;
			}
		}

		return ??;
	}
*/


/*
	public static ???? project_grade( ???? )
	// Parameters are:
	//     int p1, p2, p3, p4, p5, p6;
	{
		// given six integers representing scores out of five in each of the
		// six categories for the first six weeks project: tells you your
		// overall project grade out of 100

		int overall_grade;

		overall_grade = p1 * 6;    // six points per point for the first category
		overall_grade = overall_grade + ( p2 * 6 );   // six points per point
		overall_grade = overall_grade + ( p3 * 4 );   // four points per point
		overall_grade = overall_grade + ( p4 * 2 );   // two points per point
		overall_grade = overall_grade + ( p5 * 1 );   // one point per point
		overall_grade = overall_grade + ( p6 * 1 );   // one point per point

		return ??;
	}
*/


/*
	public static ???? get_name( ???? )
	// No parameters.
	{
		// finds out the user's name
		Scanner keyboard = new Scanner(System.in);

		String name;
		System.out.print("Please enter your name: ");
		name = keyboard.next();

		return ??;
	}
*/


/*
	public static ???? crash( ???? )
	// No parameters.
	{
		// displays "you win" or "you lose".  You lose 90% of the time.
		String magic_word;

		if ( (int)(Math.random()*10) == 0 )
		{
			// What do you know?  We won!
			magic_word = "win";
		}
		else
		{
			// No big suprise; we lost.
			magic_word = "lose";
		}

		System.out.print("you " + magic_word);

		return ??;
	}
*/

}
