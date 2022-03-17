package SortingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/sort-array-by-parity-ii/
public class SortByParity2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParityII(new int[]{4,2,5,7})));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int i=0;
        int j=1;
        while (i<nums.length && j< nums.length)
        {
            while (i<nums.length && nums[i]%2==0)
            {
                i+=2;
            }
            while (j< nums.length && nums[j]%2==1)
            {
                j+=2;
            }
            if(i< nums.length && j< nums.length)
            {
                swap(nums,i,j);
            }
        }
        return nums;
    }
    static void swap(int[] nums, int i, int x) {
        int temp=nums[i];
        nums[i]=nums[x];
        nums[x]=temp;
    }
}
