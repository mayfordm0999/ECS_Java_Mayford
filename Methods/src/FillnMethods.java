// Fill-In Methods - Fix the broken methods and method calls.

public class FillnMethods
{
	public static void main( String[] args )
	{
		// Fill in the method calls where appropriate.

		System.out.println("Watch as we demonstrate methods.");
		randchar();
        counter();
        abso();
		credits();
	}

	private static void credits() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("That's all.  This program has been brought to you by:");
		System.out.println();
		System.out.println("programmed by Sam Cummings");
		System.out.println("modified by Miranda");
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  Do with it as you wish.");

	}

	private static void abso() 
	{
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x, y = 10;
		x = -10;
		
		System.out.println("|" + x + "| = " + y );
	}

	private static void counter()
	{
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Now let's count from -10 to 10");
		
        for( int n = -10; n <= 10; n = n + 1 )
        {
        	System.out.print( n + " " );
        }
        System.out.println("How was that?");
	}
		

	private static void randchar() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
		int numval;
		char charval;
		numval = (int)(Math.random()*26);
		charval = (char) ('A' + numval);
		System.out.println("The character is: " + charval );
	}

}


