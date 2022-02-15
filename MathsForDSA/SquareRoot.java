package MathsForDSA;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(precision(65,3));
    }
    static int ans(int n)
    {
        int s=0;
        int e=n;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            if(m*m==n)
            {
                return m;
            }
            else if(m*m>n)
            {
                e=m-1;
            }
            else {
                s=m+1;
            }
        }
        return e;
    }
    static  double precision(int n,int p)
    {
        double preans=ans(n);
        double incr=0.1;
        for(int i=1;i<p;i++)
        {

            while (preans*preans<n)
            {
                preans+=incr;
            }
            preans-=incr;
            incr=incr/10;

        }
        return preans;
    }
}
