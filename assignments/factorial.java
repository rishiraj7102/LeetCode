package assignments;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.println("Factorial is "+ ans);
    }
    static int factorial(int n)
    {
       if(n==1 || n==0)
       {
           return 1;
       }
       else return n*factorial(n-1);
    }

}
