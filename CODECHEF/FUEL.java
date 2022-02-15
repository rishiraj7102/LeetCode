package CODECHEF;

import java.util.*;
        import java.lang.*;
        import java.io.*;
class Fuel
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int x,y,a,b,k;
            x=in.nextInt();
            y=in.nextInt();
            a=in.nextInt();
            b=in.nextInt();
            k=in.nextInt();
            if((x+a*k)>(y+b*k))
            {
                System.out.println("DIESEL");
            }
            else if((x+a*k)<(y+b*k))
            {
                System.out.println("PETROL");
            }
            else
            {
                System.out.println("SAME PRICE");
            }


        }
    }
}
