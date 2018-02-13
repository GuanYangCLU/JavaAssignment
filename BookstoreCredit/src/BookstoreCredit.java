import java.util.Scanner;
public class BookstoreCredit {
	public static void main(String[] args){
		String a;
		double b = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the student's name and GPA >>");
		a = input.nextLine();
		b = input.nextDouble();
		StudentCreditInfo(a,b);
	}
	public static double StudentCreditInfo(String x, double y){
		double z = y * 10;
		System.out.println("Student's Name: " + x);
		System.out.println("Student's GPA: " + y);
		System.out.println("Student's Credit: " + z +"$");
		return z;
	}
}
