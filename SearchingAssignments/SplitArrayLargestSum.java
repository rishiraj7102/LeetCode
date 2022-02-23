package SearchingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        System.out.println(splitArray(nums,2));
    }
    static int splitArray(int[] nums, int m) {
//        Arrays.sort(nums);
        int sum=0;
        int max=-1;
        for(int i:nums)
        {
            if(i>max)
            {
                max=i;
            }
            sum+=i;
        }
        int ans=0;
        int low=max;
        int high=sum;
        while (low <= high) {
            int mid=low+(high-low)/2;
            if(isValid(nums,m,mid))
            {
                high=mid-1;
                ans=mid;
            }
            else if (!isValid(nums,m,mid)){
                low=mid+1;
            }

        }
        return ans;
    }

    private static boolean isValid(int[] nums, int m, int mid) {

        int sum=0;
        int count=1;
        for (int num : nums) {
            if (sum + num > mid) {
                count++;
                sum = num;
            } else {
                sum += num;
            }
        }
        return count <= m;
    }
}
