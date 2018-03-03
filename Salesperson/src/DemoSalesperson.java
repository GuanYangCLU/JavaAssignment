
public class DemoSalesperson {
	
	public static void main (String[] args){
		
		Salesperson [] sp = new Salesperson [10];
		int i = 0;
		for (i=0;i<sp.length;i++){
			sp[i].IDnb = 9999;
			sp[i].annualsale = 0;
			System.out.println(sp[i].IDnb + "'s annual sale is " + sp[i].annualsale);
		}
	}

}

class Salesperson {
	static int IDnb;
	static double annualsale;
	public Salesperson(){}
	public Salesperson(int ID, double anusale){
		IDnb = ID;
		annualsale = anusale;
	}
	
}