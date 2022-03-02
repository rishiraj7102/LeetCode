package SearchingAssignments;
//https://curiouschild.github.io/leetcode/2019/06/21/divide-chocolate.html
public class DivideChocolate {
    public static void main(String[] args) {
       int [] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(ans(arr,5));
    }
    static int ans(int [] arr, int k){
        int min=Integer.MAX_VALUE;
        int sum=0;
        int ans=0;
        for(int i: arr)
        {
            if(i<min)
            {
                min=i;
            }
            sum+=i;
        }
        int low=min;
        int hi=sum;
        while (low<hi)
        {
            int m=low+(hi-low)/2;
            if(isValid(arr,k,m))
            {
                ans=m;
                low=m+1;
            }
            else {
                hi=m-1;
            }
        }
        return ans;
    }

    private static boolean isValid(int[] arr, int k, int m) {
        int sum=0;
        int count=1;
        for (int j : arr) {
            if (sum + j > m) {
                count++;
                sum = j;
            } else {
                sum += j;
            }
        }
        return count >= k + 1;
    }
}
