package SearchingAssignments;

import java.util.Arrays;

public class Intervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 4},
                {2, 3},
                {3, 4}
        };
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
    static int[] findRightInterval(int[][] intervals) {
        int[] nums = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            nums[i] = intervals[i][0];
        }
        int[] storage = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
         storage[i]=nums[i];
        }

        System.out.println(Arrays.toString(storage));
        int[] ansarray = new int[intervals.length];
        Arrays.sort(nums);
        for (int i = 0; i < intervals.length; i++) {
            int number = intervals[i][1];
            int answer = BinarySearch(nums, number);
            if (answer != -1) {
                int target = nums[answer];
                int finalans = LinearSearch(storage, target);
                ansarray[i] = finalans;
            }
            else {
                ansarray[i]=-1;
            }
        }
        return ansarray;
    }
    static int LinearSearch(int [] arr,int target) {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    static int BinarySearch(int [] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            if(arr[m]==target)
            {
                return m;
            }
            else if(arr[m]>target)
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        if(s< arr.length)
        {
            return s;
        }
        else
        {
            return -1;
        }
    }

}


