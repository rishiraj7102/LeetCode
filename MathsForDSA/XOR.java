package MathsForDSA;

public class XOR {
    public static void main(String[] args) {
        System.out.println(ans(2));
    }
    static int ans(int a) //calc xor from 0 to a
    {
        if(a%4==0)
            return a;
        else if(a%4==1)
            return 1;
        else if(a%4==2)
            return a+1;
        else return 0;
    }
    static int ans(int a,int b)  // xor from a to b
    {
        return ans(b) ^ ans(a-1);
    }
}
