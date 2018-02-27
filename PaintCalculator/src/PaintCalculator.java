import java.util.Scanner;
public class PaintCalculator {
	public static void main(String[] args){
		double length = 0, width = 0, height = 0, cost = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length, width, and height >>");
		length = input.nextDouble();
		width = input.nextDouble();
		height = input.nextDouble();
		cost = paintcal(length,width,height);
		System.out.println("The cost to paint a " + length + "-by-" + width + "-foot room with " + height + "-foot ceilings is " + cost +" $.");
	}
	public static double paintcal(double x, double y, double z){
		double area = 2 * (x * z + y * z);
		double gallons = gallonsneed(area);
		System.out.println("The volume to paint a " + x + "-by-" + y + "-foot room with " + z + "-foot ceilings is " + gallons +" gallons.");
		double price = pricecal(gallons);
		return price;
	}
	public static double gallonsneed(double x){
		final int para = 350;
		double g = x / para;
		return g;
	}
	public static double pricecal(double x){
		final double perprice = 32.0;
		double p = 0;
		int y = (int)x;
			if (x - y == 0){
				p = y * perprice;
			}
			else {
				p = (y + 1) * perprice;
			}
		return p;
	}
}
