package assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesfromSrtedArray {
    public static void main(String[] args) {

        int[]nums={0,0,1,1,1,2,2,3,3,4};
        int n=removedups(nums);
        System.out.println(n);
        System.out.println(Arrays.toString(nums));

    }
    static public int removedups(int [] nums)
        {
           int k=0;
           int n= nums.length;
           HashMap<Integer,Integer>hmap=new HashMap<>();
           int c=0;

           for(int i=0;i<n;i++)
           {
               int element=nums[i];
               if(hmap.containsValue(element))
               {
                   continue;
               }
               else
               {
                   hmap.put(c,element);
                   c++;
               }
           }
           k=hmap.size();
           for(int i:hmap.keySet())
           {
               nums[i]=hmap.get(i);
           }
           return k;

    }
};

