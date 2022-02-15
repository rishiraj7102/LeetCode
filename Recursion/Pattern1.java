package Recursion;
//****
//***
//**
//*
public class Pattern1 {
    public static void main(String[] args) {
        Pattern1(4);
        System.out.println();
        Pattern1v2(4,0);
    }
    static void Pattern1v2(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            Pattern1v2(r,c+1);
        }
        else {
            System.out.println();
            Pattern1v2(r-1,0);
        }
    }
    static void Pattern1(int n)
    {
        if(n==0)
        {
            return;
        }
        for (int i=0;i<n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        Pattern1(n-1);
    }
}
