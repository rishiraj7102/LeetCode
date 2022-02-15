package MathsForDSA;

public class FindPower {
    public static void main(String[] args) {
        System.out.println(ans(2,3));
    }
    static int ans(int base,int power)
    {
        int ans=1;
        while (power>0)
        {
            if((power&1)==1)
            {
                ans=ans*base;
            }
            base=base*base;
           power= power>>1;
        }
        return ans;
    }
}
