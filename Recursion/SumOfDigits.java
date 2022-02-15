package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(ans(1234));
    }
    static int ans(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem=n%10;
        return rem + ans(n/10);
    }
}
