//Armstrong number is a number that is equal to the sum of cubes of its digits.
// For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.

package practiceassignments;

import java.util.Scanner;

public class armstrongnumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0)
        {
            int rem = num % 10;
            sum+=(rem*rem*rem);
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("It is an armstrong number");

        }
        else
            System.out.println("Not an armstrong number");
    }
}
