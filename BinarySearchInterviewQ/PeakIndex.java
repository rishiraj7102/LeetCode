package BinarySearchInterviewQ;
//https://leetcode.com/problems/find-peak-element/
public class PeakIndex {
    public static void main(String[] args) {
                int []nums={1,2,3,4,5,3,2,1};
                int ans=peakelement(nums);
                System.out.println(ans);
    }
    static int peakelement(int []nums)
    {
        int start=0;
        int end= nums.length-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if( nums[mid]>nums[mid+1]) //desc part
            {
                end=mid;
            }
            else if( nums[mid]<nums[mid+1] ) //acs part
            {
                start=mid+1;
            }
        }
        return start;
    }
}
