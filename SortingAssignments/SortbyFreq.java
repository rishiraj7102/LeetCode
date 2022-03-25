package SortingAssignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/// CODE INCOMPLETE
public class SortbyFreq {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{1,1,2,2,2,3}));
    }
    static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int item : nums) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);

            } else {
                map.put(item, 0);
            }
        }
//        Collections.sort(map.keySet());
        int [] ans=new int[nums.length];
        int index=0;
        int count=1;
//        map

        return ans;
    }
}
