import java.util.Scanner;

public class Project2 {
	/******************************************************************************
	    *  Project 2 for IT501 
	    *  Caesar cipher 
	    * 
	    *  Programmer: Group4: Guan, Jim, and Andrew
	    *  Last modified: July 25, 2017
	    * 
	    *  Purpose:  This program takes input string from users via keyboard and 
	    *  encrypts the information that each letter shifts 2 letters (A¡úC, x¡úz, 
	    *  and Y¡úA), then print the encrypted message.

	    ***************************************************************************/
	private String bf = " ";	
	public Project2(){}
	public Project2(String x){
		bf = x;
	}
	
	public void encryptionAdd2 (char [] s){
		int i = 0, l = s.length;
		for (i=0;i < l;i++){
			
			if ((s[i] - 'x' > 0)&&(s[i] - 'x' < 3)){
				s[i] -= 24;
			}
			else if ((s[i] - 'x' <=0)&&(s[i] - 'x' > -24)){
				s[i] += 2;
			}
			// LowerCase
			else if ((s[i] - 'X' > 0)&&(s[i] - 'X' < 3)){
				s[i] -= 24;
			}
			else if ((s[i] - 'X' <=0)&&(s[i] - 'X' > -24)){
				s[i] += 2;
			}
			// UpperCase
			else {
				
			}
			// Space and other
		}
		String aft = new String(s);      // convert char array to String
		System.out.println("The encrypted code is: " + aft);
	}

	
	public static void main(String[] args){
		String b = " ";		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the origin code >>");
		b = input.nextLine();
		
		char [] bChar = b.toCharArray();     // convert String to char array
		Project2 encr = new Project2(b);     // initialize
		encr.encryptionAdd2(bChar);          // encrypt
	}
}