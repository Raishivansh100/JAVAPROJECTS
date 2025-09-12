import java.util.*;
public class array 
{
    public static void maxnum(int marks[])
    {
        
        int max=0;
        for (int i = 0; i < marks.length; i++)
         {
           if (marks[i]>max)
           {
               max=marks[i];
           }
         }
         System.out.println("The maximum number is: "+max);
    }
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = sc.nextInt();
        int[] marks = new int[length];
        System.out.println("Enter the marks: ");
        for (int i = 0; i < marks.length; i++) 
        {
            marks[i] = sc.nextInt();
        }
        maxnum(marks);
        sc.close();
    }
}
