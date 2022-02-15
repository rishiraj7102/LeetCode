package MathsForDSA;
//finding the sum of a given row of pascals triangle
public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(ans(5));
    }
    static int ans(int n)
    {
            return 1<<(n-1);
    }
}
