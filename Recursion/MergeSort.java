package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
//        System.out.println(Arrays.toString(Mergesort(arr)));
        InplaceMerge(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));
    }
    static int [] Mergesort(int []arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid= arr.length/2;
        int [] left= Mergesort(Arrays.copyOfRange(arr,0,mid));   //mid is not inclusive in this argument
        int [] right=Mergesort(Arrays.copyOfRange(arr,mid,arr.length));

       return merge(left,right);
    }

    static void InplaceMerge(int [] arr,int s,int e)
    {
        if(e-s==1)
        {
            return;
        }
        int mid=(s+e)/2;
       InplaceMerge(arr,s,mid);
       InplaceMerge(arr,mid,e);

       mergeInPlace(arr,s,mid,e);

    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {

        int i=s;
        int j=mid;
        int k=0;
        int [] mix=new int[e-s];
        while (i<mid && j<e)
        {
            if(arr[i]>arr[j])
            {
                mix[k]=arr[j];
                j++;
            }
            else {
                mix[k]=arr[i];
                i++;
            }
            k++;
        }
        while (i<mid)
        {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++)
        {
            arr[s+l]=mix[l];
        }
    }

    private static int[] merge(int[] left, int[] right) {
        int []mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i< left.length && j< right.length)
        {
            if(left[i]> right[j])
            {
                mix[k]=right[j];
                j++;
            }
            else {
                mix[k]=left[i];
                i++;
            }
            k++;

        }
        //if one of the array may not be complete...then
        while (i<left.length)
        {
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length)
        {
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
