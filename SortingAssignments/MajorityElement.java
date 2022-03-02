package SortingAssignments;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
//        System.out.println(Arrays.toString(mergersort(arr)));
    }
    static  int majorityElement(int[] nums) {
        nums=mergersort(nums);
        return nums[nums.length/2];
    }
    static int [] mergersort(int [] nums)
    {
        if(nums.length==1)
        {
            return nums;
        }
        int m=nums.length/2;
        int [] left=mergersort(Arrays.copyOfRange(nums,0,m));
        int [] right=mergersort(Arrays.copyOfRange(nums,m,nums.length));

        return merge(left,right);
    }

     static int[] merge(int[] left, int[] right) {
        int [] mix=new int[left.length+right.length];
        int x=0;
        int y=0;
        int z=0;
        while (x<left.length && y< right.length)
        {
            if(left[x]<right[y])
            {
                mix[z]=left[x];
                x++;
                z++;
            }
            else {
                mix[z]=right[y];
                y++;
                z++;
            }
        }
        while (x<left.length)
        {
            mix[z]=left[x];
            x++;
            z++;
        }
        while (y<right.length)
        {
            mix[z]=right[y];
            y++;
            z++;
        }
        return mix;
    }
}
