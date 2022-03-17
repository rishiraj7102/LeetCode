package SortingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/array-partition-i/
public class ArrayPartition1 {
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
    static int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        int i=0;
        while (i<nums.length)
        {
            sum+=nums[i];
            i+=2;
        }
        return sum;
    }
}
