
public class QuartsToGallons {
	public static void main (String args[]){
		final int quart0 = 18, para = 4;
		int gallon, quart;
		gallon = quart0/para;
		quart = quart0%para;
		System.out.println("A job needs " + quart0 + " quarts requires " + gallon + " gallons plus " + quart + " quarts. ");
	}
}
