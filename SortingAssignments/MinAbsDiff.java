package SortingAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/minimum-absolute-difference/
public class MinAbsDiff {
    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));
    }
    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i< arr.length-1;i++)
        {
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff==min)
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                ans.add(temp);
            }
            else if(diff<min)
            {
                min=diff;
                ans.clear();
                List<Integer> temp=new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                ans.add(temp);
            }
        }

        return ans;
    }
}
