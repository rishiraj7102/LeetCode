import java.util.Scanner;

public class countoccurences {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int digit=in.nextInt();
        int number=in.nextInt();
        int count=0;
        while(number>0)
        {
            int rem=number%10;
            if(rem==digit)
            {
                count++;
            }
            number=number/10;
        }
        System.out.println("occurences: "+count );
    }
}
