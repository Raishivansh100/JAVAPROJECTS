import java.util.Scanner;
import java.lang.Math;

public class binarytodecimal {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a binary number");   

     int n=sc.nextInt();
     double decnumber=0;
     int i=0;
     while(n>0)
     {
        int lastindex=n%10;
        decnumber=decnumber+(lastindex*Math.pow(2,i));
        n=n/10;
        i++;
     }
     System.out.println("Binary no is :"+decnumber);
     sc.close();
    }
}
