package MathsForDSA;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    static boolean isPrime(int n) {
        int upperbound=(int)Math.sqrt(n);
        for (int i = 2; i <= upperbound; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
