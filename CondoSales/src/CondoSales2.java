import java.util.Scanner;

public class CondoSales2 {

	public static void main (String[] args){
		int view = 0, parking = 0;
		final int invalid = 0, park = 150000, golf = 170000, lake = 210000, garage = 5000;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the condo view code: 1 for park,2 for golf, 3 for lake >>");
		view = input.nextInt();
		System.out.println("Please enter the parking code: 1 for garage,2 parking space >>");
		parking = input.nextInt();
		if (view == 1) {
			System.out.println("You choose park view condo");
			
			if (parking == 1) {
				System.out.println("You choose garage, the total price($) is " + (park+garage));
			}
			else if (parking == 2) {
				System.out.println("You choose parking space, the total price($) is " + park);
			}
			else {
				System.out.println("Invalid parking, the total price($) is " + park);
			}
			
		}
		else if (view == 2) {
			System.out.println("You choose golf view condo");
			
			if (parking == 1) {
				System.out.println("You choose garage, the total price($) is " + (golf+garage));
			}
			else if (parking == 2) {
				System.out.println("You choose parking space, the total price($) is " + golf);
			}
			else {
				System.out.println("Invalid parking, the total price($) is " + golf);
			}
		}
		else if (view == 3) {
			System.out.println("You choose lake view condo");
			
			if (parking == 1) {
				System.out.println("You choose garage, the total price($) is " + (lake+garage));
			}
			else if (parking == 2) {
				System.out.println("You choose parking space, the total price($) is " + lake);
			}
			else {
				System.out.println("Invalid parking, the total price($) is " + lake);
			}
		}
		
		else {
			System.out.println("Invalid input, the price($) is " + invalid);
		}
	}
}
