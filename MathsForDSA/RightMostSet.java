package MathsForDSA;

public class RightMostSet {
    public static void main(String[] args) {
        int n=6;
        System.out.println(ans(6));
    }
    static int ans(int n)
    {
        return (n & (-n)) ;
    }
}
