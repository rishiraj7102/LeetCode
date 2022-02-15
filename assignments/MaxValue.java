package assignments;

public class MaxValue {
    public static void main(String[] args) {
     int[][] points= new int[][]{
             {0,0},
             {3,0},
             {9,2}
     };
     int k=3;
     int ans=findMaxValueOfEquation(points,k);
        System.out.println(ans);
    }
    static int findMaxValueOfEquation(int[][] points, int k) {
    int max=Integer.MIN_VALUE;
    int sum1=0;
    int sum=0;
    for(int i=0;i<points.length-1;i++)
    {
        sum1=Math.abs(points[i+1][0]-points[i][0]);
        if(sum1<=k)
        {
            sum=points[i][1]+points[i+1][1]+sum1;
            if(sum>max)
            {
                max=sum;
            }
        }
    }
    return max;
    }
}
