package SortingAssignments;

import java.util.Arrays;
//https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-5,-3,-2,-1})));
    }
    static int[] sortedSquares(int[] nums){
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while (left<right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                swap(nums,left,right);
            }
            right--;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        return nums;
    }
    static void swap(int[] nums, int i, int x) {
        int temp=nums[i];
        nums[i]=nums[x];
        nums[x]=temp;
    }
}
