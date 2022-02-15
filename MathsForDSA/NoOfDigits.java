package MathsForDSA;

public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(ans(7,2));
    }
    static int  ans(int n, int base)
    {
        return (int)(Math.log(n)/Math.log(base))+1;
    }
}
