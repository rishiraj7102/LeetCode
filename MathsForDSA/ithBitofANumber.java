package MathsForDSA;

public class ithBitofANumber {
    public static void main(String[] args) {
        int n=6;
        System.out.println(ans(n,3));
    }
    static int ans(int n, int k)
    {
        return   ((n & (1 << (k - 1))) >> (k - 1));
    }
}
