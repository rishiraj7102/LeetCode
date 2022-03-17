package SortingAssignments;

import java.util.Arrays;

//https://leetcode.com/problems/relative-sort-array/
public class RelativeSortArray {
    public static void main(String[] args) {
        int [] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2={2,1,4,3,9,6};

        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pos=0;
        for(int i=0;i<arr2.length;i++)
        {
            for (int j = pos; j <arr1.length ; j++) {
//                if(pos>i)
//                {
//                    Arrays.sort(arr1,pos,arr1.length-1);
//                }
                if(arr1[j]==arr2[i])
                {
                    swap(arr1,pos,j);
                    pos++;
                }

            }
        }
//        System.out.println(pos);
        Arrays.sort(arr1,pos,arr1.length);
        return arr1;
    }

    public static void swap(int[] arr1, int pos, int i) {
        int temp=arr1[i];
        arr1[i]=arr1[pos];
        arr1[pos]=temp;
    }

}
