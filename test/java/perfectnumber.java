//In number theory, a perfect number is a positive integer that is equal
// to the sum of its positive divisors, excluding the number itself.
// For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.

import java.util.Scanner;
import java.util.Vector;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> v=new Vector<>();
        int num=sc.nextInt();
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                v.add(i);
            }
        }
        int sum=0;
        for(int i=0;i<v.size();i++)
        {
            sum+=v.elementAt(i);
        }
        if(sum==num)
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("Not a perfect number");
        }
    }
}
