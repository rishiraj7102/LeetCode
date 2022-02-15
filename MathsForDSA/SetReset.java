package MathsForDSA;

public class SetReset {
    public static void main(String[] args) {
            int n=10;
            int i=3;
            int k=2;
        System.out.println(SetBit(n,i));
        System.out.println(ResetBit(n,i));
    }
    static int SetBit(int n,int k)
    {
        int mask=1<<(k-1);
        return n | mask;
    }
    static int ResetBit(int n,int k)
    {
        int mask=~(1<<(k-1));
        return n & mask;

    }
}
