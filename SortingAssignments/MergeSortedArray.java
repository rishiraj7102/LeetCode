package SortingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m=0;
        int n=1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
       if(n==0)
       {
           return;
       }
       if(m==0)
       {
           for(int i=0;i<n;i++)
           {
               nums1[i]=nums2[i];
           }
           return;
       }
       int x=0;
       int y=0;
       while (x!=m)
       {
           if(nums1[x]<=nums2[y])
           {
               x++;
           }
           else {
               swap(nums1,nums2,x,y);
               int temp=y;
               while (temp<n-1 && nums2[temp]>nums2[temp+1])
               {
                   swap(nums2,nums2,temp,temp+1);
                   temp++;
               }
           }
       }
       int c=0;
       for(int i=m;i< nums1.length;i++)
       {
           nums1[i]=nums2[c++];
       }
    }
    static void swap(int [] arr1,int [] arr2,int x , int y)
    {
        int temp=arr1[x];
        arr1[x]=arr2[y];
        arr2[y]=temp;
    }
}
