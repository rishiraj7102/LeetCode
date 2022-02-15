package MathsForDSA;

public class MagicNo {
    public static void main(String[] args) {
        System.out.println(ans(6));
    }
    static int ans(int n)
    {
        int sum=0;
        int base=5;
        while (n>0)
        {
            int temp=n & 1;
            sum+=temp*base;
            base=base*5;
            n=n>>1;
        }
        return sum;
    }
}
