import java.util.Scanner;

public class AreaCalculatorRepeat 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.println("1) Triangle ");
		System.out.println("2) Rectangle ");
		System.out.println("3) Square ");
		System.out.println("4) Circle ");
		System.out.println("5) Quit ");
		System.out.println("Which shape? ");
		n = keyboard.nextInt();
		if(n==1)
		{
			System.out.println("What is the Base? ");
			int b = keyboard.nextInt();
			System.out.println("What is the Height? ");
			int h = keyboard.nextInt();
			double t = triangle(n,b,h);
			System.out.println("The area is " + t);
		}
		if(n==2)
		{
			System.out.println("What is the Length? ");
			int l = keyboard.nextInt();
			System.out.println("What is the width? ");
			int w = keyboard.nextInt();
			double r = rectangle(n,l,w);
			System.out.println("The area is " + r);
		}
		if(n==3)
		{
			System.out.println("What is the side length? ");
			int s = keyboard.nextInt();
			double sq = square(n,s);
			System.out.println("The area is " + sq);
		}
		if(n==4)
		{
			System.out.println("What is the radius? ");
			int ra = keyboard.nextInt();
			double c = circle(n,ra);
			System.out.println("The area is " + c);
		}
		while(n != 5)
		{
			System.out.println("1) Triangle ");
			System.out.println("2) Rectangle ");
			System.out.println("3) Square ");
			System.out.println("4) Circle ");
			System.out.println("5) Quit ");
			System.out.println("Which shape? ");
			n = keyboard.nextInt();
			if(n==1)
			{
				System.out.println("What is the Base? ");
				int b = keyboard.nextInt();
				System.out.println("What is the Height? ");
				int h = keyboard.nextInt();
				double t = triangle(n,b,h);
				System.out.println("The area is " + t);
			}
			if(n==2)
			{
				System.out.println("What is the Length? ");
				int l = keyboard.nextInt();
				System.out.println("What is the width? ");
				int w = keyboard.nextInt();
				double r = rectangle(n,l,w);
				System.out.println("The area is " + r);
			}
			if(n==3)
			{
				System.out.println("What is the side length? ");
				int s = keyboard.nextInt();
				double sq = square(n,s);
				System.out.println("The area is " + sq);
			}
			if(n==4)
			{
				System.out.println("What is the radius? ");
				int ra = keyboard.nextInt();
				double c = circle(n,ra);
				System.out.println("The area is " + c);
			}
		}
		System.out.println("Goodbye");
	}

	private static double circle(int n, int ra) 
	{
		double result;
		result = (ra*ra*3.14159);
		return result;
	}

	private static double square(int n, int s) 
	{
		double result;
		result = (s*s);
		return result;
	}

	private static double rectangle(int n, int l, int w) 
	{
		double result;
		result = (l*w);
		return result;
	}

	private static double triangle(int n, int b, int h) 
	{
		double result;
		result = (.5*b*h);
		return result;
	}

}

