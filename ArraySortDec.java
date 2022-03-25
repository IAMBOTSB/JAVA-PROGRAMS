import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraySortDec
{
    public static void main(String[] args)
    {
        String books[]=new String[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            books[i]=sc.nextLine();
        }
        Arrays.sort(books);

        for(int j=0;j<books.length;j++){
            System.out.println(books[j]);
        }
    }
}
