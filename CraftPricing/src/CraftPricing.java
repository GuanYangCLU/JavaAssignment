import java.util.Scanner;

public class CraftPricing {
	private final static double shipping = 7.0, pphr = 12.0;
	
	public static double retailprice(double c, double h){
		double rp = c + pphr*h + shipping;
		return rp;
	}
	public static void main(String[] args){		
		double mtcost = 0, hours = 0;
		String pdname = "Null";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of products >>");
		pdname = input.nextLine();
		System.out.println("Please enter the material cost >>");
		mtcost = input.nextDouble();
		System.out.println("Please enter the working hours >>");
		hours = input.nextDouble();
		System.out.println("The product " + pdname + "'s retail price($) is " + retailprice(mtcost,hours));
		
	}
}
