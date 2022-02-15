import java.util.Scanner;
import java.util.Vector;
public class palindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        Vector<Integer> v=new Vector<Integer>();
        while(temp>0)
        {
            int rem=temp%10;
            v.add(rem);
            temp=temp/10;
        }
        int n=v.size();
        int i=0;
        if(v.elementAt(n-1-i)==v.elementAt(i))
        {
            i++;
            if(i>n){
                System.out.println("It is a Palindrome");
                return;
            }
        }
        else{
            System.out.println("Not a palindrome");
            return;
        }
        System.out.println("Palindrome");

    }
}
