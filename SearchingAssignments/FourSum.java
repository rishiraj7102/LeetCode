package SearchingAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/4sum/
public class FourSum {
    public static void main(String[] args) {
        int [] nums= {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums,0));
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int target2=target-nums[i]-nums[j];
                int left=j+1;
                int right= nums.length-1;
                while (left<right)
                {
                    if(nums[left]+nums[right]<target2)
                    {
                        left++;
                    }
                    else if(nums[left]+nums[right]>target2)
                    {
                        right--;
                    }
                    else {
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);

                        while (left<right && nums[left]==list.get(2))
                        {
                            ++left;
                        }
                        while (left<right && nums[right]==list.get(3))
                        {
                            --right;
                        }
                    }
                    while (j+1< nums.length && nums[j+1]==nums[j])
                    {
                        ++j;
                    }
                    while (i+1< nums.length && nums[i+1]==nums[i])
                    {
                        ++i;
                    }
                }



            }
        }
        return ans;
    }
}
