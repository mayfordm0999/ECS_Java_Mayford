import java.util.Scanner;

public class AskingQuestions 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, feet, inches;
		double weight;
		
		System.out.print("What is your name? ");
		name = keyboard.next();
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.print("How many feet tall are you? ");
		feet = keyboard.nextInt();
		
		System.out.print("How many inches? ");
		inches = keyboard.nextInt();
		
		System.out.print("How much do you weigh? ");
		weight = keyboard.nextDouble();
		
		System.out.print("So your name is " + name + ", your age is " + age + ", you are " + feet + "'" + inches + "\", and you weigh " + weight + " lbs.");

		keyboard.close();
	}

}
