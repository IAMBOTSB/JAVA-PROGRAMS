import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CustomerbyCity {
    public static void main(String args[] ) throws Exception {
  String customerDetails[][]=new String[5][3];
    Scanner sc = new Scanner(System.in);
        String input[] = new String[1];
        while(sc.hasNextLine()){
        input[0]=sc.next();
        
	customerDetails[0][0]="1001";
	customerDetails[0][1]="Raj";
	customerDetails[0][2]="Chennai";
	
	customerDetails[1][0]="1008";
	customerDetails[1][1]="Akshay";
	customerDetails[1][2]="Pune";
	
	customerDetails[2][0]="1002";
	customerDetails[2][1]="Simrath";
	customerDetails[2][2]="Amristar";
	
	customerDetails[3][0]="1204";
	customerDetails[3][1]="Gaurav";
	customerDetails[3][2]="Delhi";
	
	customerDetails[4][0]="1005";
	customerDetails[4][1]="Ganesh";
	customerDetails[4][2]="Chennai";
	Boolean index = true;
        for(int i=0;i<5;i++){
            if((input[0].equals(customerDetails[i][2]))){
                System.out.println(customerDetails[i][0]);
                System.out.println(customerDetails[i][1]);
                System.out.println(customerDetails[i][2]);
                index=false;
            }
        }
        if(index){
            System.out.println("No Record Found");
        }	  		
	}
  }	
}
