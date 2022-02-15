package SearchingAssignments;

public class SearchiInRotatedArray {
    public static void main(String[] args) {
        int [] nums={1,3};
        System.out.println(pivot(nums));
        System.out.println(binarysearch(nums,1));
    }
//    static int search(int[] nums, int target) {
//
//    }
    static int binarysearch(int [] nums,int target)
    {
        int pivot=pivot(nums);
        if(pivot==-1)
        {
            int s=0;
            int e=nums.length-1;
            while (s<=e)
            {
                int m=s+(e-s)/2;
                if(nums[m]==target)
                {
                    return m;
                }
                else if(nums[m]>target)
                {
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
        }
        else if(nums[pivot]==target)
        {
            return pivot;
        }
        else
        {
            int s=0;
            int e=pivot-1;
            while (s<=e)
            {
                int m=s+(e-s)/2;
                 if(nums[m]==target)
                 {
                     return m;
                 }
                 else if(nums[m]>target)
                 {
                     e=m-1;
                 }
                 else{
                     s=m+1;
                 }

            }
            s=pivot+1;
            e=nums.length-1;
            while (s<=e)
            {
                int m=s+(e-s)/2;
                if(nums[m]==target)
                {
                    return m;
                }
                else if(nums[m]>target)
                {
                    e=m-1;
                }
                else{
                    s=m+1;
                }

            }

        }
    return -1;
    }

    static int pivot (int[] nums) {
        if(nums.length==1)
        {
            return 0;
        }
        int s=0;
        int e= nums.length-1;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            if(m>s && nums[m]<nums[m-1])
            {
                return m-1;
            }
            else if(m<e && nums[m]>nums[m+1])
            {
                return m;
            }

            else if(nums[m]<nums[s]){
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return -1;
    }
}
