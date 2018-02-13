import java.util.Scanner;

public class CondoSales {

	public static void main (String[] args){
		int view = 0;
		final int invalid = 0, park = 150000, golf = 170000, lake = 210000;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the condo view code: 1 for park,2 for golf, 3 for lake >>");
		view = input.nextInt();
		if (view == 1) {
			System.out.println("You choose park view condo, the price($) is " + park);
		}
		else if (view == 2) {
			System.out.println("You choose golf view condo, the price($) is " + golf);
		}
		else if (view == 3) {
			System.out.println("You choose lake view condo, the price($) is " + lake);
		}
		else {
			System.out.println("Invalid input, the price($) is " + invalid);
		}
	}
}
