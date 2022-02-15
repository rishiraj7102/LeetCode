package BinarySearchInterviewQ;

import java.util.Arrays;

//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArray {
    public static void main(String[] args) {
        int[] arr={0,0};
//        System.out.println(BinarySearch(arr,2));
        System.out.println(specialArray(arr));
    }
    static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++)
        {
            int pos=BinarySearch(nums,i);
            if(nums.length-pos==i)
            {
                return i;
            }
        }
        return -1;
    }
    static int BinarySearch(int [] nums,int target)
    {
        int s=0;
        int e=nums.length-1;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            if(nums[m]==target)
            {
                return m;
            }
            else if(nums[m]<target)
            {
                s=m+1;
            }
            else
            {
                e=m-1;
            }

        }
        return  s;
    }
}
