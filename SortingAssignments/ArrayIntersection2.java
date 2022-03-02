package SortingAssignments;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class ArrayIntersection2 {
    public static void main(String[] args) {
        int [] nums1={4,9,5};
        int []nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    static  int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x=0, y=0;
        int c=0;
        ArrayList<Integer> list =new ArrayList<>();
//        int [] ans = new int[Math.min(nums1.length, nums2.length)];
        while (x<nums1.length && y<nums2.length)
        {
            if(nums1[x]==nums2[y])
            {
//                ans[c++]=nums1[x];
                list.add(nums1[x]);
                x++;

                y++;
            }
            else if(nums1[x]>nums2[y])
            {
                y++;
            }
            else {
                x++;
            }
        }
        int [] ans = new int[list.size()];
        for(int i:list)
        {
            ans[c++]=i;
        }
        return ans;
    }

}
