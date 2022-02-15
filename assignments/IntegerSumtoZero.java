package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerSumtoZero {
    public static void main(String[] args) {
        int n;
        Scanner in =new Scanner(System.in);
        n= in.nextInt();
        int num=n/2;
        int index=0;
        int[] ans=new int[n];
        while(num>0)
        {
            ans[index++]=num;
            ans[index++]=-num;
            num--;
        }
        if(n%2!=0)
        {
            ans[index++]=0;
        }
        System.out.println(Arrays.toString(ans));
    }
}
