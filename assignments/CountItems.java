package assignments;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class CountItems {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[]gain=new int[n];
        for(int i=0;i<n;i++)
        {
            gain[i]=sc.nextInt();
        }
        int[] ans=new int[n+1];
        int max=Integer.MIN_VALUE;
        ans[0]=0;
        int j=1;
        for(int i:gain)
        {
            ans[j]=ans[j-1]+i;
            j++;
            if(max<ans[j])
            {
                max=ans[j];
            }
        }
        System.out.println(max);
    }
}
