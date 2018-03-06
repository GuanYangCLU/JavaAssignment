
public class TomJerry {
	public static void main (String[] args) {
		double tom = 50000, jerry = 60000;
		final double t = 1.05, j = 1.01;
		int year = 0;
		System.out.println(">> Assume that the first year the income has been increased");
		while (tom <= jerry) {
			tom *= t;
			jerry *= j;
			System.out.println("Tom's income is: " + tom + "; Jerry's income is: " + jerry);
			year++;
		}
		System.out.println("It took " + year + " years for Tom to exceed Jerry");
	}
}
