import java.util.Scanner;

public class Eggs {
public static void main(String args[]){
	final double dozenprice = 3.25, individualprice = 0.45;
	final int para = 12, cent = 100, individualpricecent = (int)(individualprice * cent);
	int eggs, dozen, individual;
	double price;
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the eggs you order >>");
	eggs = input.nextInt();
	dozen = eggs / para;
	individual = eggs % para;
	price = dozen * dozenprice + individual * individualprice;
	System.out.println("You ordered " + eggs + " eggs. That¡¯s " + dozen + " dozen at $" + dozenprice + " per dozen and " + individual + " loose eggs at " + individualpricecent + " cents each for a total of $" + price);
	
}
}
