package MathsForDSA;
// given an array, find the number that only appears once where all others appear twice exactly
public class AppearsOnce {
    public static void main(String[] args) {
        int [] arr={2,3,4,1,2,1,3,6,4};
        System.out.println(ans(arr));
    }
    static int ans(int [] arr)
    {
        int xor=0;
        for(int i:arr)
        {
            xor=xor^i;
        }
        return xor;
    }
}