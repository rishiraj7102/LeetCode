package SortingAssignments;

import java.util.Arrays;
//https://leetcode.com/problems/height-checker/
public class HeightChecker {

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));

    }
        static public int heightChecker(int[] heights) {
            int [] copy=new int[heights.length];
            int count=0;
            System.arraycopy(heights, 0, copy, 0, heights.length);
            Arrays.sort(copy);
            for(int i=0;i<heights.length;i++)
            {
                if(copy[i]-heights[i]!=0)
                {
                    count++;
                }
            }
            return count;
        }
}


