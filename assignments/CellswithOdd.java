package assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CellswithOdd {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int [][] indices={
                {0,1},
                {1,1}
        };
        int[][] a=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=0;
            }
        }
        for(int i=0;i<indices.length;i++)
        {
            for(int j=0;j<indices[0].length;j++)
            {
                if(j==0)
                {
                    int col=a[0].length-1;
                    while(col>=0)
                    {
                        a[indices[i][j]][col]++;
                        col--;
                    }

                }
                else
                {
                    int row=a.length-1;
                    while(row>=0)
                    {
                        a[row][indices[i][j]]++;
                        row--;
                    }
                }
            }
        }
        for(int []x:a)
        {
            System.out.println(Arrays.toString(x));
        }
    }
}
