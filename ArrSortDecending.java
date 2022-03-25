import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrSortDecending
{
    public static void main(String[] args) throws Exception
    {
        String books[]=new String[5];
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){

        for(int i=0;i<5;i++){
            books[i]=sc.nextLine();
        }
        Arrays.sort(books,Collections.reverseOrder());

        for(int j=0;j<books.length;j++){
            System.out.println(books[j]);
        }
        }
    }
}
