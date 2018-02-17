import java.util.Scanner;
public class MetricConversion {	
	public static void main(String[] args){
		int a = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer >>");
		a = input.nextInt();
		inchestocentimeters(a);
		gallonstoliters(a);
	}
	public static double inchestocentimeters(int x){
		final double intocm = 2.54;
		double y = x * intocm;
		System.out.println(x + " inches equals to " + y + " centimeters.");
		return y;
	}
	public static double gallonstoliters (int x){
		final double gatoli = 3.7854;
		double y = x * gatoli;
		System.out.println(x + " gallons equals to " + y + " liters.");
		return y;
	}
}
