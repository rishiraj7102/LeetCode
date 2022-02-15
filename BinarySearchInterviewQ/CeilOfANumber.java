package BinarySearchInterviewQ;
//https://leetcode.com/problems/search-insert-position/submissions/
public class CeilOfANumber {
    public static void main(String[] args) {
        int[] nums={1,2,4,5};
        int ans=ceil(nums,3);
        System.out.println(ans);
    }
    static int ceil(int []nums,int number)
    {

        int s=0;
        int e=nums.length-1;

        while (s<=e)
        {
             int mid=(s+e)/2;
            if(nums[mid]==number)
            {
                return number;
            }
            else if(nums[mid]<number)
            {
                s=mid+1;
            }
            else if(nums[mid]>number)
            {
                e=mid-1;
            }
        }
        return nums[s];
    }
}
