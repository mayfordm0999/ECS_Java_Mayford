import java.util.Scanner;

public class HowOldSpecifically 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Hey, What is your name? ");
		name = keyboard.next();
		
		System.out.print("OK, " + name + ", How old are you? ");
		age = keyboard.nextInt();
		
		if( age < 16 )
		{
			System.out.println("You cannot drive.");
		}
		if( age == 16||age == 17 )
		{
			System.out.println("You can drive, but can't vote.");
		}
		if( age == 18 || age == 19 || age == 20 || age == 21 || age == 22 || age ==23 || age ==24 )
		{
			System.out.println("you can vote but not rent a car.");
		}
		if(age >= 25)
		{
			System.out.println("You can pretty much do whatever you want.");
		}
	}

}
