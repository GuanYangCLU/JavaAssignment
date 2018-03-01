import java.util.Scanner;

public class QuartsToGallonsInteractive {
public static void main (String args[]){
	final int para = 4;
	int quart0, gallon, quart;
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the quarts >>");
	quart0 = input.nextInt();
	gallon = quart0/para;
	quart = quart0%para;
	System.out.println("A job needs " + quart0 + " quarts requires " + gallon + " gallons plus " + quart + " quarts. ");
}
}
