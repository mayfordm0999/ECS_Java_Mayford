import java.util.Scanner;

public class DumbCalc 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Double one, two, three;
		
		System.out.print("What is the first number? ");
		one = keyboard.nextDouble();
		System.out.print("What is the second number? ");
		two = keyboard.nextDouble();
		System.out.print("What is the third number? ");
		three = keyboard.nextDouble();
		System.out.print("The Average is " + ((one + two + three) * 1/3));
		
	}
	
}
