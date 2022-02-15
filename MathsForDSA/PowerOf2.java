package MathsForDSA;
//given a number, state if it is a power of 2 or not
public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(ans(8));
    }
    static boolean ans(int n)
    {
        return (n & (n-1))==0;
    }
}
