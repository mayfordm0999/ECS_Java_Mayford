import java.util.Scanner;

public class BMICalcBetter 
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int ft, in;
		double lb;
		
		System.out.println("BMI (Body Mass Index) is a way of representing your size.");
		System.out.println("");
		
		System.out.print("How many feet tall are you?");
		ft = keyboard.nextInt();
		System.out.print("How many inches?");
		in = keyboard.nextInt();
		System.out.print("How many lbs do you weigh?");
		lb = keyboard.nextDouble();
		System.out.println("Your BMI is: " + ((lb * .4536)/((ft * 0.3048 + in * 0.0254 )*(ft * 0.3048 + in * 0.0254))));
		if((lb * .4536)/((ft * 0.3048 + in * 0.0254 )*(ft * 0.3048 + in * 0.0254)) < 18.5) 
		{
			System.out.println("You are underweight.");
		}
		if((lb * .4536)/((ft * 0.3048 + in * 0.0254 )*(ft * 0.3048 + in * 0.0254)) >= 18.5 && (lb * .4536)/((ft * 0.3048 + in * 0.0254 )*(ft * 0.3048 + in * 0.0254)) <= 24.9) 
		{
			System.out.println("You are normal.");
		}
		if((lb * .4536)/((ft * 0.3048 + in * 0.0254 )*(ft * 0.3048 + in * 0.0254)) >= 25.0 && (lb * .4536)/((ft * 0.3048 + in * 0.0254 )*(ft * 0.3048 + in * 0.0254)) < 30.0) 
		{
			System.out.println("You are overweight.");
		}
		if((lb * .4536)/((ft * 0.3048 + in * 0.0254 )*(ft * 0.3048 + in * 0.0254)) > 30.0) 
		{
			System.out.println("You are obese.");
		}
	}
}