import java.util.Scanner;

public class UserInputOfData 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String Fn, Ln, log;
		int g, id;
		double gpa;
		
		System.out.print("First Name: ");
		Fn = keyboard.next();
		System.out.print("Last Name: ");
		Ln = keyboard.next();
		System.out.print("Grade: ");
		g = keyboard.nextInt();
		System.out.print("Student ID: ");
		id = keyboard.nextInt();
		System.out.print("Login: ");
		log = keyboard.next();
		System.out.print("GPA: ");
		gpa = keyboard.nextDouble();
		System.out.println("");
		System.out.println("Your Information: ");
		System.out.println("     Login: " + log);
		System.out.println("     ID: " + id);
		System.out.println("     Name: " + Ln + ", " + Fn);
		System.out.println("     GPA: " + gpa);
		System.out.println("     Grade: " + g);
	}

}
