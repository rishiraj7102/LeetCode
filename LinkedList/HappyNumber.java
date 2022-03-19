package LinkedList;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    static boolean isHappy(int n) {
        int f=n;
        int s=n;
        do{
            s=sumofsquares(s);
            f=sumofsquares(sumofsquares(f));

        }while (s!=f);
        if(s==1)
        {
            return true;
        }
        return false;
    }
    static int sumofsquares(int n)
    {
        int sum=0;
        while (n>0)
        {
            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }
}
