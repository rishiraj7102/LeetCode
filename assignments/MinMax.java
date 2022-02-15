package assignments;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        minmax(a,b,c);
    }
    static void minmax(int a,int b,int c)
    {
        int max=a;
        if(max<b)
        {
            max=b;

        }
        if(max<c)
        {
           max=c;
        }
        System.out.println("max number is "+ max);
        int min=a;
        if(min>b)
        {
            min=b;

        }
        if(min>c)
        {
            min=c;
        }
        System.out.println("min is "+ min);

    }

}
