package SortingAssignments;
///https://leetcode.com/problems/sort-colors/
public class SortColors {
    public static void main(String[] args) {

    }
    public void sortColors(int[] nums) {
        int red=0;
        int white=0;
        int blue=0;
        for(int i:nums)
        {
            if(i==0)
            {
                red++;
            }
            else if(i==1)
            {
                white++;
            }
            else if(i==2)
            {
                blue++;
            }

        }
        int c=0;
        for(int i=0;i<red;i++)
        {
            nums[c]=0;
            c++;
        }
        for(int i=0;i<white;i++)
        {
            nums[c]=1;
            c++;
        }
        for(int i=0;i<blue;i++)
        {
            nums[c]=2;
            c++;
        }
    }
}

