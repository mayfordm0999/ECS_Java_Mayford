import java.util.Scanner;

public class NameAgeSalary 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		double salary;
		
		System.out.print("Hello. What is your name? ");
		name = keyboard.next();
		
		System.out.print("Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		
		System.out.print( age + "? Ok, " + name + " How much money do you make an hour? ");
		salary = keyboard.nextDouble();
		
		System.out.print("Wow " + name + ", " + salary + "? That's a lot for your age! ");
		keyboard.close();
	}

}
