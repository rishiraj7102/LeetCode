package MathsForDSA;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(odd(5));
    }
    // function to check if the number is odd
    static boolean odd(int n)
    {
        if((n & 1)==1)
        {
            return true;
        }
        return false;
    }
}
