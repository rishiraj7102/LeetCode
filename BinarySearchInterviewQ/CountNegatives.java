package BinarySearchInterviewQ;

public class CountNegatives {
    public static void main(String[] args) {
        int [][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}};
//        int [][] grid={
//                {3,2},
//                {1,0}
//        };
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {
    int l=0;
    int r=grid[0].length-1;
    int sum=0;
    while (l<grid.length && r>0)
    {
        if(grid[l][r]>=0)
        {
            l++;
        }
        else{
            sum+=l;
            for(int i=0;i<r;i++)
            {
                if(grid[l][i]<0)
                {
                    sum++;
                }
            }
            r--;
        }
    }
    return sum;
    }
}
