import java.util.Scanner;

public class CellPhoneService {

	public static void main (String[] args){
		double talktime = 0, txtmsg = 0,data;
		final double talk = 500, text = 100, Gbs = 2; 
		final int pA = 49, pB = 55, pC = 61, pD = 70, pE = 79, pF = 87;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the talking time(minutes) you need >>");
		talktime = input.nextDouble();
		System.out.println("Please enter the text messages you need >>");
		txtmsg = input.nextDouble();
		System.out.println("Please enter the gigabytes you need >>");
		data = input.nextDouble();
		
		//data type 1
		if (data == 0) {
			
			//time type 1
			if ((talktime > 0) && (talktime < talk)) {
				
				if (txtmsg == 0) {
					System.out.println("You choose plan A, the total price($) is " + pA);
				}
				else if (txtmsg > 0) {
					System.out.println("You choose plan B, the total price($) is " + pB);
				}
				else {
					System.out.println("Invalid input, please try it again");
				}
				
			}
			
			//time type 2
			else if ((talktime >= talk)) {
				
				if ((txtmsg >= 0) && (txtmsg < text)) {
					
					System.out.println("You choose plan C, the total price($) is " + pC);
				}
				else if (txtmsg >= text) {
					System.out.println("You choose plan D, the total price($) is " + pD);
				}
				else {
					System.out.println("Invalid input, please try it again");
				}
			}
			
			//time type 3
			else {
				System.out.println("Invalid input, please try it again");
			}
		}
		
		//data type 2
		else if ((data > 0) && (data < Gbs)) {
				
			System.out.println("You choose plan E, the total price($) is " + pE);
		}
		
		//data type 3
		else if (data >= Gbs) {
			System.out.println("You choose plan F, the total price($) is " + pF);
		}
		
		//data type 4					
		else {
			System.out.println("Invalid input, please try it again");
		}
	}
}
