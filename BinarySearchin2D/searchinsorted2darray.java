package BinarySearchin2D;

import java.util.Arrays;

public class searchinsorted2darray {
    public static void main(String[] args) {
        int[][]nums={
                {10,20,30,40},
                {15,25,35,45},
                {28,36,37,49},
                {33,40,42,50}
        };
        int []ans=search(nums,50);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int [][] nums,int target)
    {
        int lb=0;
        int ub=nums[0].length-1;
        while (lb<nums.length && ub>=0)
        {
            if(nums[lb][ub]>target)
            {
                ub--;
            }
            else if(nums[lb][ub]==target)
            {
                return new int[]{lb,ub};
            }
            else
            {
                lb++;
            }
        }
        return new int []{-1,-1};
    }
}
