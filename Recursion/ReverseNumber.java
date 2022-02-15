package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(helper(1234));
    }
    static int helper(int n)
    {
        return ans(n,0);
    }

    static int ans(int n,int sum)
    {
        if(n==0)
        {
            return sum ;
        }
        int rem=n%10;
        sum =sum *10 +rem;
        return ans(n/10,sum);
    }


}
