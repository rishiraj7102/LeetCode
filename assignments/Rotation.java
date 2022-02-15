package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int [][] mat= {{0,0,0},{0,1,0},{1,1,1}};
        int [][] target={{1,1,1},{0,1,0},{0,0,0},};
//        ArrayList<Integer> list=new ArrayList<>();
//        int [][] newmat=new int[mat.length][mat.length];
        for(int i=0;i<4;i++)
        {
            if(Arrays.deepEquals(mat,target)){
                System.out.println(true);
            }
            mat=rotateMatrix(mat);
            if(i==3)
            {
//                return false;
            }
        }

    }

     static int[][] rotateMatrix(int[][] mat) {
        int n=mat.length;
        int [][] rotatedmat=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rotatedmat[j][n-1-i]=mat[i][j];

            }
        }
        return rotatedmat;
    }
}
