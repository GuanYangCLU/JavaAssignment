package test;
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		final int dz = 12;
		final double p1 = 3.25, p2 = 0.45;
		int eggs, d, l;
		double price;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the eggs:");
		eggs = input.nextInt();
		d = eggs/dz;
		l = eggs%dz;
		price = d*p1 + l*p2;
		System.out.println("You ordered " + eggs + " eggs. That¡¯s " + d + " dozen at $3.25 per dozen and " + l + " loose eggs at 45 cents each for a total of $" + price);
		
		
	}


}
