import java.util.Scanner;

public class SpaceBoxing 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int number;
		double weight;
		
		System.out.print("Please enter your current earth weight: ");
		weight = keyboard.nextDouble();
		
		System.out.println("I have information for the following planets: ");
		System.out.println("     1. Venus     2. Mars     3. Jupider");
		System.out.println("     4. Saturn    5. Uranus   6. Neptune");
		
		System.out.print("Which planet are you visiting? ");
		number = keyboard.nextInt();
		
		if( number == 1)
		{
			System.out.println("Your weight would be " + ( weight * .78) + " lbs on that planet.");
		}
		if( number == 2)
		{
			System.out.println("Your weight would be " + ( weight * .39) + " lbs on that planet.");
		}
		if( number == 3)
		{
			System.out.println("Your weight would be " + ( weight * 2.65) + " lbs on that planet.");
		}
		if( number == 4)
		{
			System.out.println("Your weight would be " + ( weight * 1.17) + " lbs on that planet.");
		}
		if( number == 5)
		{
			System.out.println("Your weight would be " + ( weight * 1.05) + " lbs on that planet.");
		}
		if( number == 6)
		{
			System.out.println("Your weight would be " + ( weight * 1.23) + " lbs on that planet.");
		}
	}

}
