package SortingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/third-maximum-number/
public class ThirdLargest {
    public static void main(String[] args) {
            int [] nums={1,2,2,3};
        System.out.println(thirdMax(nums));
    }
    static int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        boolean found=false;
        int x=n-1,count=1;
        while (x>=0)
        {
            if(count==3)
            {
                found=true;
                break;
            }
            if(x>=1 && nums[x]!=nums[x-1])
            {
                count++;
            }
            x--;
        }
        if(found)
        {
            return nums[x];
        }
        return nums[n-1];
    }
}
