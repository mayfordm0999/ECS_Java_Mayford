import java.util.Random;

public class Magic8Ball 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int choice = 1 + r.nextInt(15);
		String response = "";
		
		if(choice == 1)
			response = "It is certain";
		else if ( choice == 2 )
			response = "It is decidedly so";
		else if ( choice == 3 )
			response = "Without a doubt";
		else if ( choice == 4 )
			response = "Yes - definatelly";
		else if ( choice == 5 )
			response = "You may rely on it";
		else if ( choice == 6 )
			response = "As I see it, yes";
		else if ( choice == 7 )
			response = "Most likely";
		else if ( choice == 8 )
			response = "outlook good";
		else if ( choice == 9 )
			response = "signs point to yes";
		else if ( choice == 10 )
			response = "Yes";
		else if ( choice == 11 )
			response = "Reply hazy, try again";
		else if ( choice == 12 )
			response = "Ask again later";
		else if ( choice == 13 )
			response = "Better not tell you now";
		else if ( choice == 14 )
			response = "Connot predict now";
		else if ( choice == 15 )
			response = "Concentrate and ask again";
		else if ( choice == 16 )
			response = "No";
		else if ( choice == 17 )
			response = "Maybe";
		else if ( choice == 18 )
			response = "Absolutely not";
		else if ( choice == 19 )
			response = "idc";
		else if ( choice == 20 )
			response = "I dont think so";
		else
			response = "8-BALL ERROR!";
			
			System.out.println("MAGIC 8-BALL SAYS: " + response );
		
	}

}
