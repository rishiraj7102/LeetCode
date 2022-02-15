package BinarySearchInterviewQ;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int []nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet=new HashSet<>();
        Arrays.sort(nums2);
        for(int i:nums1)
        {
            if(BinarySearch(nums2,i))
            {
                hashSet.add(i);
            }
        }
        int [] ans=new int[hashSet.size()];
        int x=0;
        for(int i:hashSet)
        {
            ans[x++]=i;
        }
        return ans;
    }
    static boolean BinarySearch(int [] arr,int target)
    {
     int s=0;
     int e=arr.length-1;
     while (s<=e)
     {
         int m=s+(e-s)/2;
         if(arr[m]==target)
         {
             return true;
         }
         else if(arr[m]>target)
         {
             e=m-1;
         }
         else{
             s=m+1;
         }
     }
     return false;
    }
}
