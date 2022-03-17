package SortingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/sort-array-by-parity/
public class SortBYParity {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0,2,1,3,5})));
    }
    static int[] sortArrayByParity(int[] nums) {
//            Arrays.sort(nums);
            int x=0;
            int y=nums.length-1;
            while (x<y)
            {
                if(nums[x]%2==0 && nums[y]%2==0)
                {
                    x++;
                }
                else if(nums[x]%2!=0 && nums[y]%2==0)
                {
                    swap(nums,x,y);
                    x++;
                    y--;
                }
                else if(nums[x]%2==0 && nums[y]%2!=0)
                {
                    x++;
                    y--;
                }
                else {
                    x++;
                    y--;
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
