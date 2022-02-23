package SearchingAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallerThanSelf {
    public static void main(String[] args) {
        int [] nums={26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
        System.out.println(countSmaller(nums));
    }
    static  List<Integer> countSmaller(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums)
        {
            arr.add(i);
        }
        Collections.sort(arr);
        for (int num : nums) {
            int index = BS(arr, num);
            ans.add(index);
            arr.remove(index);
        }
        return ans;
    }
    static int BS(ArrayList<Integer>nums, int target)
    {
        int low=0;
        int hi=nums.size()-1;
        while (low<=hi)
        {
            int m=low+(hi-low)/2;
            if(nums.get(m)==target)
            {
                return m;
            }
            else if(nums.get(m)>target)
            {
                hi=m-1;
            }
            else {
                low=m+1;
            }
        }
        return -1;
    }
}
