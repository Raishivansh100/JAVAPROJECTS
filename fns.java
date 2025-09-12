
import java.util.*;

public class fns {
    public static int product(int a, int b) {
        b = 5;
        a = 10;
        return a * b;
    }

    public static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        int fact=1;
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        /*
         * int a=5;
         * int b=10;
         * int prod=product(a,b);
         * System.out.println(prod);
         * System.out.print(a+" "+b);
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
        sc.close();
    }
}
