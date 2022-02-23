package SearchingAssignments;
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class ShipCapacity {
    public static void main(String[] args) {
        int [] weights= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(weights,5));
    }
    static  int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:weights)
        {
            max=Math.max(i,max);
            sum+=i;
        }
        int s=max;
        int e=sum;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            int temp=0;
            int count=1;
            for(int i=0;i<weights.length;i++)
            {
               temp+=weights[i];
               if(temp>m)
               {
                   temp=weights[i];
                   count++;
               }

            }
            if(count<=days)
            {
                e=m-1;
            }
            else {
                s=m+1;
            }
        }
        return s;
    }
}
