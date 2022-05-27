package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.geeksforgeeks.org/sum-triangle-from-array/
public class SumTriangle {
    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5 };
        sumTriangle(A);
    }
    public static void sumTriangle(int [] a)
    {
        if(a.length<1)
        {
            return;
        }
        int [] temp=new int[a.length-1];
        for(int i=0;i<a.length-1;i++)
        {
            int x=a[i]+a[i+1];
            temp[i]=x;
        }

        sumTriangle(temp);

        System.out.println(Arrays.toString(a));
    }
}
