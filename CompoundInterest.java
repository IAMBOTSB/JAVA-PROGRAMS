import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompoundInterest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double i = sc.nextDouble();
        int n = sc.nextInt();
        double total = calculateAmount(p, i, n);
        System.out.println(total);
    }
    public static double calculateAmount(double p,double i, int n){

        for(int j=0;j<n;j++){
            p=p*i/100+p;
        }
        return p;
    }

}
