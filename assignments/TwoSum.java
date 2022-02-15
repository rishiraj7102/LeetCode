package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int [] ans=new int[2];
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []nums= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        int [] temp=nums.clone();
        System.out.println(Arrays.toString(temp));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(temp));

        int target=in.nextInt();
        int s=0;
        int e=nums.length-1;
        while(s<e)
        {
            if(nums[s]+nums[e]==target)
            {
                ans= new int[]{s, e};
                System.out.println(Arrays.toString(ans));
                return;
//                break;

            }
            else if(nums[s]+nums[e]>target)
            {
                e--;
            }
            else{
                s++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
