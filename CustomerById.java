import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CustomerById{
    public static void main(String[] args) throws Exception{
        String customerDetails[][]=new String[5][3];
        Scanner sc = new Scanner(System.in);
        String input[] = new String[1];

        input[0]=sc.next();
        


        customerDetails[0][0]="1001";
        customerDetails[0][1]="Raj";
        customerDetails[0][2]="Chennai";

        customerDetails[1][0]="1002";
        customerDetails[1][1]="1001";
        customerDetails[1][2]="1001";

        customerDetails[2][0]="1003";
        customerDetails[2][1]="1001";
        customerDetails[2][2]="1001";

        customerDetails[3][0]="1004";
        customerDetails[3][1]="1001";
        customerDetails[3][2]="1001";

        customerDetails[4][0]="1005";
        customerDetails[4][1]="1001";
        customerDetails[4][2]="1001";
        Boolean index = true;
        for(int i=0;i<5;i++){
            if((input[0].equals(customerDetails[i][0]))){
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
