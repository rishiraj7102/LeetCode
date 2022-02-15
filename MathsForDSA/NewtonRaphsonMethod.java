package MathsForDSA;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.println(ans(65));
    }
    static double ans(int n)
    {
        double x=n;
        double error;
        while (true)
        {
            double root=(x+n/x)/2;
            error=Math.abs(root-x);
            if(error<1)
            {
                return root;
            }
            else {
                x=root;
            }
        }
    }
}
