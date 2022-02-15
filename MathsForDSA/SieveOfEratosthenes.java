package MathsForDSA;

public class SieveOfEratosthenes{
    public static void main(String[] args) {
        int n=40;
        boolean[] values = new boolean[n+1];
        sieve(values,n);
    }
    static void sieve(boolean [] arr, int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(!arr[i])
            {
                for(int j=2*i;j<=n;j=j+i)
                {
                    arr[j]=true;
                }
            }
        }
        for (int i=2;i<=n;i++)
        {
            if(arr[i]==false)
            {
                System.out.print(i+" ");
            }
        }
    }
}
