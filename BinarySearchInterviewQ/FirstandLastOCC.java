package BinarySearchInterviewQ;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
import java.util.Arrays;

public class FirstandLastOCC {
    public static void main(String[] args) {
        int []nums={2,3,3,3,3,4,5,6};
        int []ans=new int[2];
        ans[0]=searchans(nums,3,true);
        ans[1]=searchans(nums,3,false);
        System.out.println(Arrays.toString(ans));

    }
    static int  searchans(int []nums,int target,boolean firstoccurence)
    {
        int start=0;
        int ans=-1;
        int end= nums.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }

            else if(nums[mid]==target)
            {
                ans=mid;
                if(firstoccurence)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;
    }

}
