
public class ZYXtest01 {
	public static void main(String[] args){		
		int i =0,j;
		switch (i){
		    case 0:
		        for (j=0;j<15;j++){
		        	if ((j>5&&j<9)||(j>10&&j<14)){
		        		System.out.print(" ");
		        	}
		        	else{
		        		System.out.print("*");
		        	}		        	
		        i++;
		        }
		        System.out.println();
		    case 1:
		        for (j=0;j<15;j++){
	        	    if ((j==3)||(j==6)||(j==8)||(j==11)||(j==13)){
	        		    System.out.print("*");
	        	    }
	        	    else{
	        		    System.out.print(" ");
	        	    }	        	    
	            i++;
		        }
		        System.out.println();
		    case 2:
		        for (j=0;j<15;j++){
        	        if ((j==2)||(j==7)||(j==12)){
        		        System.out.print("*");
        	        }
        	        else{
        	        	System.out.print(" ");
        	        }       	        
        	    i++;
		        }
		        System.out.println();
		    case 3:
		    	for (j=0;j<15;j++){
		    		if ((j==1)||(j==7)||(j==11)||(j==13)){
		    			System.out.print("*");
		    		}
		    		else{
		    			System.out.print(" ");
		    		}		    		
		    	i++;
		    	}
		    	System.out.println();
		    case 4:
		    	for (j=0;j<15;j++){
		    		if ((j>4&&j<7)||(j>7&&j<10)||(j>10&&j<14)){
		    			System.out.print(" ");
		    		}
		    		else{
		    			System.out.print("*");
		    		}		    		
		    	}
		    	System.out.println();
		    break;
		}
	}
}



/*recycle
for (i=1;i<6;i++){




*/
