package assignments;

import java.math.BigInteger;

public class GoodArray {
    public static void main(String[] args) {

        int [] ans={29,6,10};
        boolean a=isGoodArray(ans);
        System.out.println(a);
    }
    static boolean isGoodArray(int[] nums) {
        int ans=nums[0];
        for(int i=1;i< nums.length;i++)
        {
            ans= gcd(ans,nums[i]);
        }
        return ans==1;
    }
    static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
