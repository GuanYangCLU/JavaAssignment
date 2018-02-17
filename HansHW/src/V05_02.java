import java.util.Scanner;
public class V05_02 {
    public static void main(String[] args){
    	int n =4, i,j;
    	Scanner inputsize2 = new Scanner(System.in);
    	System.out.println("Please enter the Diamond's size >>");
    	n = inputsize2.nextInt();
    	for (i=0;i<(2*n-1);i++){
    		if (i<n){
    		    for (j=1;j<=(2*n-1);j++){
    			    if ((j==n-i)||(j==n+i)){
    			    	System.out.print("*");
    			    
    			    }
    			    else {
    			    	System.out.print(" ");
    			    }
    		    }
    		}
    		else {
    			for (j=1;j<=(2*n-1);j++){
    			    if ((j==n+2*n-1-(i+1))||(j==n-(2*n-1-(i+1)))){
    			    	System.out.print("*");    // n+-(2n-1-(i+1))  n为中心线x轴位置，+-放大空格，上半lay-1即i
    			                                  // 下半空格宽为 high-lay 即 2n-1 - (i+1)
    			    }
    			    else {
    			    	System.out.print(" ");
    			    }
    			}
    		}
    		System.out.println();
    	}
    }
}
