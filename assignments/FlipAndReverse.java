package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class FlipAndReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for (int[] ints : a) {
            int s = 0;
            int e = n - 1;
            while (s < e) {
                swap(ints[s], ints[e]);
                s++;
                e--;
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    switch (a[i][j]){
                        case 0:
                            a[i][j]=1;
                            break;
                        case 1:
                            a[i][j]=0;
                            break;
                    }

                }
            }

        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
        }
    }
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }

}
