package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber2{
    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};
        List<Integer> list=new ArrayList<>();
        list=missingnumber(arr);
        System.out.println(list);
    }
    static List<Integer> missingnumber(int[] nums)
    {
        List<Integer> list=new ArrayList<>();
        int i=0;
        while (i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                list.add(i+1);
            }
        }
        return list;
    }
}
