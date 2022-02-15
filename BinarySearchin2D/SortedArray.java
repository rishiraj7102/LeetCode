package BinarySearchin2D;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int [][]nums={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(searcher(nums,6)));
    }

    static int[] BinarySearch(int[][] nums, int row,int cstart,int cend,int target)
    {
        while (cstart<=cend)
        {
            int mid=cstart+(cstart-cend)/2;
            if(nums[row][mid]==target)
            {
                return new int[]{row,mid};
            }
            else if(nums[row][mid]>target)
            {
                cend=mid-1;
            }
            else{
                cstart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] searcher(int [][]nums,int target)
    {
        int rows=nums.length;
        int cols=nums[0].length;
        int cmid=cols/2;
        int rstart=0;
        int rend=rows-1;
        while (rstart<(rend-1))
        {
            int rmid=rstart+(rend-rstart)/2;
            if(nums[rmid][cmid]==target)
            {
                return new int[]{rmid,cmid};
            }
            else if(nums[rmid][cmid]>target)
            {
                rend=rmid;
            }
            else {
                rstart=rend;
            }
        }
        if(nums[rstart][cmid]==target)
        {
            return new int[]{rstart,cmid};
        }
        if(nums[rend][cmid]==target)
        {
            return new int[]{rstart+1,cmid};
        }
        if(nums[rstart][cmid-1]>=target)
        {
            return BinarySearch(nums,rstart,0,cmid-1,target);
        }
        if(nums[rstart][cmid+1]<=target && target<=nums[rstart][cols-1])
        {
            return BinarySearch(nums,rstart,cmid+1,cols-1,target);
        }
        if(nums[rend][cmid-1]>=target)
        {
            return BinarySearch(nums,rend,0,cmid-1,target);
        }
        else
        {
            return BinarySearch(nums,rend,cmid+1,cols-1,target);
        }
//        return new int[]{-1,-1};
    }
}
