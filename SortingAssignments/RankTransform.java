package SortingAssignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/rank-transform-of-an-array/
public class RankTransform {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }
    static int[] arrayRankTransform(int[] arr) {
        int [] temp=new  int[arr.length];
        int val=1;
        System.arraycopy(arr, 0, temp, 0, arr.length);
        Arrays.sort(temp);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<temp.length;i++)
        {
            if(!map.containsKey(temp[i]))
            {
                map.put(temp[i],val++);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
//    static int BS(int []arr, int target)
//    {
////        int ans=0;
//        int s=0;
//        int e=arr.length-1;
//        while (s<=e)
//        {
//            int m=s+(e-s)/2;
//            if(arr[m]==target)
//            {
//               return m;
//            }
//            else if(arr[m]>target)
//            {
//                e=m-1;
//            }
//            else {
//                s=m+1;
//            }
//        }
//        return -1;
//    }
}
