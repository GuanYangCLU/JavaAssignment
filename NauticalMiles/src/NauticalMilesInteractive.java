import java.util.Scanner;

public class NauticalMilesInteractive {
public static void main(String args[]){
	final double ntok = 1.852, ntom = 1.150779; // declare constants about parameters of kilometer and mile
	double nauticalmile, kilometer, mile; // declare variables
	Scanner input = new Scanner(System.in); // set input class
	System.out.println("Please enter the nautical miles value (double)>>"); // hint to enter nautical miles
	nauticalmile = input.nextDouble(); // give variables values
	kilometer = nauticalmile * ntok; // compute kilometers
	mile = nauticalmile * ntom; // compute miles
	System.out.println(nauticalmile + " nautical miles equals to " + kilometer + " kilometers or " + mile + " miles.");
	// display results
}
}
