
public class NumbersDemo {
	public static void main(String[] args){
		int a = 1, b = 2;
		displayTwiceTheNumber(a); displayTwiceTheNumber(b);
		displayNumberPlusFive(a); displayNumberPlusFive(b);
		displayNumberSquared(a); displayNumberSquared(b);
	}
	public static int displayTwiceTheNumber(int x){
		int y = 2 * x;
		System.out.println(y);
		return y;
	}
	public static int displayNumberPlusFive(int x){
		int y = x + 5;
		System.out.println(y);
		return y;
	}
	public static int displayNumberSquared(int x){
		int y = x * x;
		System.out.println(y);
		return y;
	}
}
