package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(helper(302010));
    }
    static int helper(int n)
    {
        return ans(n,0);
    }
    static int ans(int n, int count)
    {
        if(n==0)
        {
            return count;
        }
        if(n%10==0)
        {

            count++;
        }
        return ans(n/10,count);
    }
}
