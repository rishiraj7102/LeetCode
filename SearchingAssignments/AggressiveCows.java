package SearchingAssignments;

import java.util.Arrays;
import java.util.Scanner;

//https://www.spoj.com/problems/AGGRCOW/
public class AggressiveCows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int cows=in.nextInt();
        int [] arr= new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println(mindist(arr,3));
    }
    static int mindist(int []arr,int cows)
    {
        Arrays.sort(arr);
        int ans=0;
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        while (low<=high)
        {
            int m=low+(high-low)/2;
            if(canPlace(arr,cows,m))
            {
                ans=m;
                low=m+1;
            }
            else {
                high=m-1;
            }
        }
        return ans;
    }
    static boolean canPlace(int[] arr,int cows,int m)
    {
        int a1=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-a1>=m)
            {
                count++;
                a1=arr[i];
            }
            if(count==cows)
            {
                return true;
            }
        }
        return false;
    }

}
