package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int [][] matrix=new int[m][n];
        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
               matrix[i][j]= in.nextInt();
            }
        }
        List<Integer>listx=new ArrayList<>();
        List<Integer>listy=new ArrayList<>();

        for(int i=0;i< matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    listx.add(i);
                    listy.add(j);
                }
            }
        }
        for(int i:listx)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=0;
            }
        }
        for(int j:listy)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][j]=0;
            }
        }
        for(int []a:matrix)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
