import java.util.Scanner;
public class V05 {
    public static void main(String[] args){
    	int n = 4, i,j;
    	Scanner inputsize = new Scanner(System.in);
    	System.out.println("Please enter the size of Diamond>>");
    	n = inputsize.nextInt();
    	for (i=0;i<n;i++){
    		
            for (j=1;j<=(2*n-1);j++){
    			if ((j==n-i)||(j==n+i)){
    			    System.out.print("*");
    			    
    			    }
    			else {
    			    	System.out.print(" ");
    			    }
    		}
    		System.out.println();  
    	}                                       //�����ϰ벿�֣��°벿��i--������ӡ��ע��iΪlay-1������i������ֱ��0������i>-1
    	
    	for (i=n-2;i>-1;i--){
    		
            for (j=1;j<=(2*n-1);j++){
			    if ((j==n-i)||(j==n+i)){
			    	System.out.print("*");
			    
			        }
			    else {
			    	         System.out.print(" ");
			        }
		    }    		
    	     System.out.println();
    	}    	
    }
}
    

