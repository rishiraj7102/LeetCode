package SearchingAssignments;

public class MaxValue {
    public static void main(String[] args) {
        System.out.println(maxValue(8,7,14));
    }
    static long maxValue(int n, int index, int maxSum) {
        long r=n-index-1;
        long l=index;
        long ans = 0;
        long lo=1;
        long hi=maxSum;
        while (lo<=hi)
        {
            long mid=lo+(hi-lo)/2;
            long sum=mid;
            long rs=0;
            long ls=0;
            long m=mid-1;
            if(r<=m)
            {
                rs=m*(m+1)/2-(m-r)*(m-r+1)/2;
            }
            else
            {
                rs=m*(m+1)/2+ 1*(r-m);
            }
            if(l<=m)
            {
                ls=m*(m+1)/2 - (m-l)*(m-l+1)/2;
            }
            else
            {
                ls=m*(m+1)/2 +1*(l-m);
            }
            sum+=ls+rs;
            if(sum<=maxSum)
            {
                ans = mid;
                lo=mid+1;

            }
            else
            {
                hi=mid-1;
            }
        }
        return ans;
    }
}
