package SortingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/largest-perimeter-triangle/
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{1,1,2}));
    }
    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int x=nums.length-3;
        int y= nums.length-2;
        int z=nums.length-1;
        while (x>=0)
        {
            if(nums[x]+nums[y]>nums[z])
            {
                return nums[x]+nums[y]+nums[z];
            }
            else {
                x--;
                y--;
                z--;
            }
        }
        return 0;

    }

}
