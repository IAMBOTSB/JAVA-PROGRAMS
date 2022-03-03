import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CalculateSalary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        if(salary>10000) {
            System.out.println("Salary Too Large");
        }
        else if(salary<0) {
            System.out.println("Salary Too Small");
        }
        else{
            int shifts=sc.nextInt();
            if(shifts<0)
            System.out.println("Shifts too Small");
            else{
                int savings;
                int spent = (salary*50)/100;
                int shiftMoney=(salary*2)/100;
                int totalShift=shifts*shiftMoney;
                System.out.println(totalShift +spent);
            }
        }
    }
}
