import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Project1 {
	/******************************************************************************
	    *  Project 1 for IT501 
	    *  GPA calculator 
	    * 
	    *  Programmer: Group4: Guan, Jim, and Andrew
	    *  Last modified: July 25, 2017
	    * 
	    *  Purpose:  This program takes input from a file named "Grades_in.txt", 
	    *      which contains five students' grades information, each student has
	    *      5 courses and grades of these courses.
	    *      This program converts students' grades to numerical points to 
	    *      calculate the GPA and sends students' GPA to the file "GPA_out.txt". 

	    ***************************************************************************/ 

	public static void main(String[] args){
		try {
			//declare  variables
			String line = " ", stname = " ";
			int  courseNb = 0;         //courseNb is also line number
			double Total = 0, gpa = 0;
					
			// Start input***
			File grade = new File("Grades_in.txt");     // Project1 folder Root Directory***
			InputStreamReader reader = new InputStreamReader(new FileInputStream(grade));
			BufferedReader grd = new BufferedReader(reader);
			// Start output***
			File GPA = new File("GPA_out.txt");
			GPA.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(GPA));			

			// Read and calculate
			while (line != null) {
				line = grd.readLine();
				if (line == null){                 // Last line processing -- exception
					gpa = Total/(courseNb-1);
					BigDecimal gpa2 = new BigDecimal(gpa).setScale(2, BigDecimal.ROUND_HALF_UP);
					out.write(stname + "'s GPA:" + gpa2 + "\r\n\r\n");
					courseNb = 0;
					Total = 0;
					break;
				}
				                              
				if (courseNb == 0){
					stname = line;          //first line is name
					courseNb++;
				}
				else if (line.charAt(0) == '-'){       //  courseNb == 6 OR line.charAt() == '-'
					gpa = Total/(courseNb-1);
					BigDecimal gpa2 = new BigDecimal(gpa).setScale(2, BigDecimal.ROUND_HALF_UP);
					out.write(stname + "'s GPA:" + gpa2 + "\r\n\r\n");
					courseNb = 0;
					Total = 0;              //turn to another student
				}
				else {
					Total += getGrade(line);       // get and add grades
					courseNb++;
				}
				
			}
			out.flush();
			out.close();			
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}	

	public static double getGrade (String str){
		int a = str.indexOf(":");
		int b = str.indexOf(";");
		str = str.substring(a+1,b);
	
		double grade = 0;
		if (str.equals("A")) {
			grade = 4.0;
		}
		else if (str.equals("A-")){
			grade = 3.7;
		}
		else if (str.equals("B+")){
			grade = 3.3;
		}
		else if (str.equals("B")){
			grade = 3.0;
		}
		else if (str.equals("B-")){
			grade = 2.7;
		}
		else if (str.equals("C+")){
			grade = 2.3;
		}
		else if (str.equals("C")){
			grade = 2.0;
		}
		else if (str.equals("C-")){
			grade = 1.7;
		}
		else if (str.equals("D+")){
			grade = 1.3;
		}
		else if (str.equals("D")){
			grade = 1.0;
		}
		else if (str.equals("D-")){
			grade = 0.7;
		}
		else {
			
		}		
		return grade;
	}	
}
