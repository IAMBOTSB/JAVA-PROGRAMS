import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CustomerArray {
	public static void main(String args[] ) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    String[][] customerDetails = new String[5][3];
	     while(sc.hasNextLine()){
	    customerDetails[0][0]=sc.nextLine();
	    customerDetails[0][1]=sc.nextLine();
	    customerDetails[0][2]=sc.nextLine();
	    customerDetails[1][0]=sc.nextLine();
	    customerDetails[1][1]=sc.nextLine();
	    customerDetails[1][2]=sc.nextLine();
	    customerDetails[2][0]=sc.nextLine();
	    customerDetails[2][1]=sc.nextLine();
	    customerDetails[2][2]=sc.nextLine();
	    customerDetails[3][0]=sc.nextLine();
	    customerDetails[3][1]=sc.nextLine();
	    customerDetails[3][2]=sc.nextLine();
	    customerDetails[4][0]=sc.nextLine();
	    customerDetails[4][1]=sc.nextLine();
	    customerDetails[4][2]=sc.nextLine();
	    String[] id = new String[5];
	    for(int i=0;i<5;i++){
	        id[i]=customerDetails[i][1];
	    }
	    Arrays.sort(id);
	    for(String s : id){
	        for(int i=0;i<5;i++){
	            if(s.equals(customerDetails[i][1])){
	                System.out.println(customerDetails[i][0]);
	                System.out.println(customerDetails[i][1]);
	                System.out.println(customerDetails[i][2]);
	            }
	        }
	    }	    		
	}
  }	
}
