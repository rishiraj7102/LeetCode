package MathsForDSA;

public class NumberOfSetBits {
    public static void main(String[] args) {
        System.out.println(ans(6));
    }
    static int ans(int n)
    {
        int ans=0;
        while (n>0)
        {
            ans++;
            n=n-(n&(-n));
        }
        return ans;
    }
}
