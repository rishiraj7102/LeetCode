package assignments;

import java.util.Arrays;
import java.util.Scanner;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class TransposeMatrix {
    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//    Scanner in = new Scanner(System.in);
//        int n=in.nextInt();
        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i<j)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
//                swap(matrix,i,j);

            }

        }
//
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
//                swap(matrix,i,j);
//                int temp=matrix[i][j];
//                matrix[i][j]=matrix[j][i];
//                matrix[j][i]=temp;
                System.out.println(matrix[i][j]);
            }

        }    }

}
