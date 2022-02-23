package BinarySearchInterviewQ;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int []nums={3,3,3,3,3,3,3,3,1,3};
        int pivot=pivot(nums);
        System.out.println(pivot);
//        int index=searcher(nums,6,pivot);
//        System.out.println(index);

    }
    static int searcher(int []nums,int target,int pivot)
    {
        if(nums[pivot]==target)
        {
            return pivot;
        }
        else if(nums[0]<target)
        {
            return BinarySearch(nums,target,0,pivot-1);
        }
        else{
            return BinarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    static int BinarySearch(int []nums,int number,int s,int e)
    {
        while (s<=e)
        {
            int mid=(s+e)/2;
            if(nums[mid]==number)
            {
                return mid;
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
        return -1;
    }
    static int pivot(int []nums)
    {
        if(nums.length==0)
        {
            return 0;
        }
        int pivot=-1;
        int s=0;
        int e= nums.length-1;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            if(nums[m]>nums[m+1])
            {
                return m;
            }
            else if(m>0 && nums[m-1]>nums[m])
            {
                return m-1;
            }
            else if(nums[s]>nums[m])
            {
                e=m-1;
            }
            else if(nums[s]<nums[m])
            {
                s=m+1;
            }
        }
        return pivot;
    }
}
