package variables;

public class MoreVariablesAndPrinting 
{
	public static void main( String[] args )
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		double cent, kilo;
		
		myName = "Zed A. Shaw";
		myAge = 35; //not a lie
		myHeight = 74; //inches
		cent = 187.96; // cm
		myWeight = 180; //lbs
		kilo = 81.6466266; // kg
		myEyes = "blue";
		myTeeth = "white";
		myHair = "brown";
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches (or " + cent + " cm) tall.");
		System.out.println("He's " + myWeight + " pounds (or " + kilo + " kg) heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");
		
		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");
	}

}
