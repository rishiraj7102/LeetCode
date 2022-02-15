package assignments;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
            int [][] matrix={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
            List<Integer> list=spiralorder(matrix);
        System.out.println(list);
        for(int i:list)
        {
            System.out.println(i);
        }
    }
    static public List<Integer> spiralorder(int [][] matrix)
    {
        List<Integer> list=new ArrayList<>();
        int top=0;
        int left=0;
        int bottom= matrix.length-1;
        int right=matrix[0].length-1;
        int dir=0;
        while(top<=bottom && left<=right)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    list.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    list.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(dir==3)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return list;
    }
}
