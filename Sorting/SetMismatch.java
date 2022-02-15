package Sorting;

public class SetMismatch {
    public static void main(String[] args) {
        int [] arr={1,2,2,4};
        System.out.println(setmismatch(arr));
    }
    static int setmismatch(int [] nums)
    {
        int i=0;
        while (i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else {
                i++;
            }
        }
        for( i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return -1;
    }

}
