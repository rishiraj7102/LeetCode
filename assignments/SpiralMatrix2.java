package assignments;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix2 {
    public static void main(String[] args) {
            int [][] ans=spiralorder(3);
        for(int []a:ans)
        {
            for(int i:a)
            {
                System.out.println(i);
            }
        }
    }
    static public int[][] spiralorder(int n)
    {
        int[][] ans=new int[n][n];
        int top=0;
        int left=0;
        int bottom= n-1;
        int right=n-1;
        int dir=0;
        int number=1;
        while(top<=bottom && left<=right)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    ans[top][i]=number;
                    number++;
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    ans[i][right]=number;
                    number++;
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    ans[bottom][i]=number;
                    number++;
                }
                bottom--;
            }
            else if(dir==3)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans[i][left]=number;
                    number++;
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }
}
