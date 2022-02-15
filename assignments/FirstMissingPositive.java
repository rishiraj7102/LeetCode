package assignments;

public class FirstMissingPositive {
    public static void main(String[] args) {
            int[] nums={7,8,9,11,12
            };
            int ans=firstMissingPositive(nums);
            System.out.println(ans);
    }
    static int firstMissingPositive(int[] nums) {
        int ans;
        int n=nums.length;
        int pos;
        for(int i=0;i<n;i++)
        {
            pos=nums[i]-1;
            while(1<=nums[i] && nums[i]<=n && nums[i]!=nums[pos])
            {
                int temp=nums[i];
                nums[i]=nums[pos];
                nums[pos]=temp;
                pos=nums[i]-1;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }

        return n+1;
    }
}
