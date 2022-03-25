package SortingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/3sum-closest/
public class ThreeSumCLosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{1,1,1,0}, -100));
    }

    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            int left=i+1;
            int right=nums.length-1;
            while (left<right)
            {
                int currentsum=x+nums[left]+nums[right];
                if(currentsum==target)
                {
                    return target;
                }
                else if(currentsum<target)
                {
                    left++;
                }
                else {
                    right--;
                }

                if(Math.abs(currentsum-target)<Math.abs(ans-target))
                {
                    ans=currentsum;
                }
            }




    }
        return ans;
}
}
