import java.util.Scanner;

public class Student {
	private static String IDnb = "9999";
	private static double crdhrs = 3, crdpts = 12;
	public Student(){}
	public Student(String id, double hrs, double pts){
		IDnb = id;
		crdhrs = hrs;
		crdpts = pts;
	}
	private static double GPA = 0;
	public void setinfo(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the student's ID number >>");
		IDnb = input.nextLine();
		System.out.println("Please enter the student's credit hours >>");
		crdhrs = input.nextDouble();
		System.out.println("Please enter the student's credit points >>");
		crdpts = input.nextDouble();
	}
	public double cptGPA(double h, double p){
		double a = p/h;
		return a;
	}
	public static void main(String[] args){
		double sthrs = 3, stpts = 12;
		String stid = "9999";
		Student st = new Student(stid, sthrs, stpts);
		st.setinfo();
		System.out.println("Student's information: ");
		System.out.println("Student's ID number: " + st.IDnb);
		System.out.println("Student's credit hours: " + st.crdhrs);
		System.out.println("Student's credit points: " + st.crdpts);
		System.out.println("Student's GPA: " + st.cptGPA(st.crdhrs, st.crdpts));
	}
}
