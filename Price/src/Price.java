import java.util.Scanner;

public class Price {
	private static double price, quantity, couponvalue;  //I will call them in static main
	public Price(){}         // constructor method here
	public Price(double p, double q, double cv){
		price = p;
		quantity = q;
		couponvalue = cv;
	}
	
	public void getandset(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the price, quantity, and couponvalue >>");
		price = input.nextDouble();
		quantity = input.nextDouble();
		couponvalue = input.nextDouble();
	}
	
	public double computeprice(double a, double b, double c){
		final double tip = 0.2;  // I can set the tip rate here
		double total = (a*b-c)*(1 + tip);  // the formula of compute sum price
		return total;
	}
	public static void main(String[] args){
		Price Init = new Price(20,10,5);   // before input
		System.out.println("The initiate sum($) is: " + Init.computeprice(price, quantity, couponvalue));
		Init.getandset();      // after input
		System.out.println("The current sum($) is: " + Init.computeprice(price, quantity, couponvalue));
		
	}
}


/*1. Create a class named "Price", this class contains

three private fields: price, quantity, couponvalue
Methods to get and set each of the fields
one constructor with three parameters, these three parameters can initialize price, quantity and coupon value
 as specified (for instance, 20, 10, 5)
computeprice() method with three parameters, they represent the price of a meal , the quantity ordered and a 
coupon value. Multiple the price and quantity, reduce the result by the coupon value, and then add 20% tip and 
return the total price.
The class should contain a main() method which tests constructor method, get and set methods, and 
computeprice() method£¨use system.out.println() to show different results£©
*/