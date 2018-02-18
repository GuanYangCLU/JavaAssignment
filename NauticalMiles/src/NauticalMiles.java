
public class NauticalMiles {
public static void main(String args[]){
	final double ntok = 1.852, ntom = 1.150779; // declare constants about parameters of kilometer and mile
	double nauticalmile, kilometer, mile; // declare variables
	nauticalmile = 6.66;                  // assign a value for nauticalmile
	kilometer = nauticalmile * ntok;      // compute values of kilometers
	mile = nauticalmile * ntom;           // compute values of miles
	System.out.println("6.66 nautical miles equals to " + kilometer + " kilometers or " + mile + " miles."); 
	// display results
}
}
