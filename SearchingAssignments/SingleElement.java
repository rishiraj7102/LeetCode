package SearchingAssignments;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            boolean halfsareeven=((e-s)&2)==0;
            if(nums[m]==nums[m+1])
            {
                if(halfsareeven)
                {
                    s=m+2;
                }
                else {
                    e=m-1;
                }
            }
            else if(nums[m]==nums[m-1])
            {
                if(halfsareeven)
                {
                    e=m-2;
                }
                else {
                    s=m+1;
                }
            }
            else {
                return nums[m];
            }
        }
        return -1;
    }
}