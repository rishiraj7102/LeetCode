package SearchingAssignments;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
public class MinimumInSorted {
    public static void main(String[] args) {
        int []nums={3,3,3,3,3,3,3,3,1,3};
        System.out.println(findMin(nums));

    }
    static int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;

        while (s<=e)
        {
            int m=s+(e-s)/2;
            if(m>1 && nums[m]<nums[m-1])
            {
                return nums[m];
            }
            else if(m<nums.length-1 && nums[m]>nums[m+1])
            {
                return nums[m+1];
            }
           else if(nums[m]>=nums[s] && nums[m]<=nums[e])
            {
                e=m-1;
            }
           else {
               s=m+1;
            }
        }
        return nums[s];
    }
}
