package SortingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class NumbersSmaller {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7,7,7,7})));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] temp= Arrays.copyOf(nums,nums.length);
    Arrays.sort(temp);
    for(int i=0;i<nums.length;i++)
    {
        int elem=nums[i];
        int pos=BS(temp,elem);
        nums[i]=pos;
    }
    return nums;
    }
    static int BS(int []sorted,int target)
    {
        int ans=-1;
        int s=0;
        int e= sorted.length-1;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            if(sorted[m]==target)
            {
                ans=m;
                e=m-1;
            }
            else if(sorted[m]>target)
            {
                e=m-1;
            }
            else
                s=m+1;
        }
        return ans;
    }
}
