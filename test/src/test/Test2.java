package test;
//测试构造函数 申明方法
public class Test2 {
	private double radius;
	private String color;
	public Test2(){}
	public Test2(double r, String c){
		radius = r;
		color = c;
	}
	public double getArea(){
		final double pi = 3.14;        //MATH.PI
		double area = pi * radius * radius;
		return area;
	}
	
	

	
	
	
	
	
	public static void main(String[] args){
		Test2 ob1 = new Test2(4.0,"Blue");
		double s = ob1.getArea();
		System.out.println(s + ob1.color);
		
		
		
	}
}
